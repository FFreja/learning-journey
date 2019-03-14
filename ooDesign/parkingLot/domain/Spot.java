package parkingLot.domain;

import parkingLot.enums.SpotSize;

public abstract class Spot {
  int number = 0;
  double rate = 0;
  SpotSize size;
  boolean isFree;
  abstract int assignTo(Vehicle v);
}
