package parkingLot.domain;

import parkingLot.enums.SpotSize;

public abstract class Spot {
  int number = 0;
  long rate = 0;
  boolean isFree;
  SpotSize size;

  int assignTo(Vehicle v) {
    isFree = false;
    return this.number;
  }

  public SpotSize getSize() {
    return size;
  }

  public long getRate() {
    return rate;
  }

  public int getNumber() {
    return number;
  }

  public boolean isFree() {
    return isFree;
  }
}
