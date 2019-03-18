package parkingLot.domain;

import java.time.LocalDateTime;

public class Ticket {
  LocalDateTime exitAt;
  private int id;
  private LocalDateTime enterAt;
  private Vehicle vehicle;
  private Spot spot;

  public Ticket(int id) {
    this.enterAt = LocalDateTime.now();
    this.id = id;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Spot getSpot() {
    return spot;
  }

  public void setSpot(Spot spot) {
    this.spot = spot;
  }

  public int getId() {
    return id;
  }

  public LocalDateTime getEnterAt() {
    return enterAt;
  }

  public LocalDateTime getExitAt() {
    return exitAt;
  }

  public void setExitAt(LocalDateTime exitAt) {
    this.exitAt = exitAt;
  }
}
