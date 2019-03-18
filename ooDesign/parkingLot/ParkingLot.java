package parkingLot;

import parkingLot.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  private static List<Spot> smallSpots = new ArrayList<>();
  private static List<Spot> mediumSpots = new ArrayList<>();
  private static List<Spot> largeSpots = new ArrayList<>();
  private static TicketService ticketService = TicketService.getTicketService();
  private static PaymentSystem paymentSystem = new PaymentSystem();

  public static void main(String[] args) throws Exception {
    initialSpots();
    Vehicle car = new Car(1);
    enter(car);

    Vehicle van = new Van(2);
    enter(van);

    Vehicle truck = new Truck(3);
    enter(truck);

    exit(1);
    exit(2);
    exit(3);
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

  /**
   * payment system
   *
   * @param ticketId
   * @return
   * @throws Exception
   */
  private static long exit(int ticketId) throws Exception {
    Ticket ticket = ticketService.complete(ticketId);
    returnSpot(ticket.getSpot());
    return paymentSystem.checkout(ticket);
  }

  /**
   * put spot back to free list and update spot status
   *
   * @param spot
   * @throws Exception
   */
  private static void returnSpot(Spot spot) throws Exception {
    switch (spot.getSize()) {
      case SMALL:
        smallSpots.add(spot);
        break;
      case MEDIUM:
        mediumSpots.add(spot);
        break;
      case LARGE:
        largeSpots.add(spot);
        break;
      default:
        throw new Exception("This spot is not available");
    }
    spot.returnSpot();
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
