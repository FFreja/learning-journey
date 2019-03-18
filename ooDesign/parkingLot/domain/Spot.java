package parkingLot.domain;

import parkingLot.enums.SpotSize;

public abstract class Spot {
  private int number = 0;
  private boolean isFree = true;
  private Vehicle vehicle;

  public Spot(int number) {
    this.number = number;
  }

  public int assignTo(Vehicle v) throws Exception {
    if (isFree) this.vehicle = v;
    else throw new Exception("This Spot is in use");
    isFree = false;
    return this.number;
  }

  public void returnSpot() {
    this.vehicle = null;
    this.isFree = true;
  }

  public abstract long getRate();

  public abstract SpotSize getSize();

  public int getNumber() {
    return number;
  }

  public boolean isFree() {
    return isFree;
  }
}
