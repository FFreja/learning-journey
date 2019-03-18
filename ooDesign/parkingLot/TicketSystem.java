package parkingLot;

import parkingLot.domain.Spot;
import parkingLot.domain.Ticket;
import parkingLot.domain.Vehicle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TicketSystem {
  private static int id =
      1; // In real life, we can have a key generation service or having incrementally id from DB.
  private static Map<Integer, Ticket> ticketDB = new HashMap<>();
  private static TicketSystem ticketSystem;

  /**
   * only one ticket service allowed to ensure no duplicate tickets get created. It is helpful once
   * system has multiple entries.
   *
   * @return
   */
  public static TicketSystem getTicketSystem() {
    if (ticketSystem == null) ticketSystem = new TicketSystem();
    return ticketSystem;
  }

  /**
   * Assign a spot to a Vehicle And generate ticket with initial data.
   *
   * @param vehicle
   * @param spot
   * @return
   */
  Ticket generateTicket(Vehicle vehicle, Spot spot) throws Exception {
    Ticket ticket = new Ticket(id);
    ticket.setSpot(spot);
    ticket.setVehicle(vehicle);
    ticketDB.put(id, ticket);
    id++;
    return ticket;
  }

  /**
   * Print out information of parking Update ticket data in DB
   *
   * @param id
   * @return
   * @throws Exception
   */
  Ticket complete(int id) throws Exception {
    if (!ticketDB.containsKey(id)) {
      throw new Exception("Invalid ticket");
    }
    Ticket ticket = ticketDB.get(id);
    ticket.setExitAt(LocalDateTime.now());
    Spot spot = ticket.getSpot();

    System.out.println("***** Print out Ticket info *****");
    System.out.println("Ticket ID : " + ticket.getId());
    System.out.println("Enter At : " + ticket.getEnterAt());
    System.out.println("Exit At : " + ticket.getExitAt());
    System.out.println("Rate : " + spot.getRate());
    System.out.println("Spot : " + spot.getSize() + spot.getNumber());
    System.out.println("SpotStatus : " + (spot.isFree() ? "Free" : "in use"));
    System.out.println(
        ticket.getVehicle().getType() + " : " + ticket.getVehicle().getPlateNumber());

    return ticket;
  }
}
