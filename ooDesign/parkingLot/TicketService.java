package parkingLot;

import parkingLot.domain.Spot;
import parkingLot.domain.Ticket;
import parkingLot.domain.Vehicle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TicketService {
  private static int id =
      1; // In real life, we can have a key generation service or having incrementally id from DB.
  private static Map<Integer, Ticket> ticketDB = new HashMap<>();
  private static TicketService ticketService;

  /**
   * only one ticket service allowed to ensure no duplicate tickets get created. It is helpful once
   * system has multiple entries.
   *
   * @return
   */
  public static TicketService getTicketService() {
    if (ticketService == null) {
      return new TicketService();
    } else {
      return ticketService;
    }
  }

  Ticket generateTicket(Vehicle vehicle, Spot spot) {
    Ticket ticket = new Ticket(id);
    ticket.setSpot(spot);
    ticket.setVehicle(vehicle);
    id++;
    ticketDB.put(id, ticket);
    return ticket;
  }

  Ticket complete(int id) throws Exception {
    if (!ticketDB.containsKey(id)) {
      throw new Exception("Invalid ticket");
    }
    Ticket ticket = ticketDB.get(id);
    ticket.setExitAt(LocalDateTime.now());

    System.out.println("***** Print out Ticket info *****");
    System.out.println("ID : " + ticket.getId());
    System.out.println("Enter At" + ticket.getEnterAt());
    System.out.println("Exit At" + ticket.getExitAt());
    System.out.println("Rate : " + ticket.getSpot().getRate());
    System.out.println("Spot : " + ticket.getSpot().getNumber());
    System.out.println("SpotStatus : " + ticket.getSpot().isFree());
    System.out.println("Vehicle Type : " + ticket.getVehicle().getType());
    System.out.println("Vehicle Plate Number : " + ticket.getVehicle().getPlateNumber());
    return ticket;
  }
}
