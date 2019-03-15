package parkingLot;

import parkingLot.domain.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  static List<Spot> smallSpots = new ArrayList<>();
  static List<Spot> mediumSpots = new ArrayList<>();
  static List<Spot> largeSpots = new ArrayList<>();
  static TicketService ticketService = TicketService.getTicketService();

  public static void main(String[] args) throws Exception {

    Vehicle car = new Car(1);
    enter(car);

    Vehicle van = new Van(2);
    enter(van);

    Vehicle truck = new Truck(3);
    enter(truck);

    System.out.println(exit(1));
  }

  private static Ticket enter(Vehicle vehicle) throws Exception {
    Spot spot;
    switch (vehicle.getType()) {
      case CAR:
        spot = smallSpots.get(smallSpots.size() - 1);
        break;
      case VAN:
        spot = mediumSpots.get(mediumSpots.size() - 1);
        break;
      case TRUCK:
        spot = largeSpots.get(largeSpots.size() - 1);
        break;
      default:
        throw new Exception("This vehicle is not supported");
    }

    return ticketService.generateTicket(vehicle, spot);
  }

  private static long exit(int ticketId) throws Exception {
    Ticket ticket = ticketService.complete(ticketId);
    Spot spot = ticket.getSpot();
    long rate = spot.getRate();
    Duration duration = Duration.between(ticket.getEnterAt(), ticket.getExitAt());
    long hours = duration.getSeconds() / (60 * 60);
    return hours * rate;
  }

  private static void initialSpots() {
    for (int i = 0; i < 10; i++) {
      Spot small = new SmallSpot(i);
      smallSpots.add(small);
      Spot medium = new MediumSpot(i);
      mediumSpots.add(medium);
      Spot large = new LargeSpot(i);
      largeSpots.add(large);
    }
  }
}
