package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class LargeSpot extends Spot {
  private static final long RATE = 10;
  private static final SpotSize SIZE = SpotSize.LARGE;

  public LargeSpot(int number) {
    this.number = number;
  }

  @Override
  public long getRate() {
    return RATE;
  }

  @Override
  public SpotSize getSize() {
    return SIZE;
  }
}
