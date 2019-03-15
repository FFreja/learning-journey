package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class LargeSpot extends Spot {
  public static final double rate = 10;
  public static final SpotSize size = SpotSize.LARGE;

  public LargeSpot(int number) {
    this.number = number;
  }
}
