package parkingLot.domain;

import parkingLot.enums.SpotSize;

public abstract class Spot {
  int number = 0;
  boolean isFree = true;
  Vehicle vehicle;

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
