package parkingLot;

import parkingLot.domain.Spot;
import parkingLot.domain.Ticket;

import java.time.Duration;

public class PaymentSystem {
  public long checkout(Ticket ticket) {
    Spot spot = ticket.getSpot();
    long rate = spot.getRate();
    Duration duration = Duration.between(ticket.getEnterAt(), ticket.getExitAt());
    long hours = duration.getSeconds() / (60 * 60) + 1;
    long total = hours * rate;
    System.out.println("Total Amount : " + total);
    return total;
  }
}
