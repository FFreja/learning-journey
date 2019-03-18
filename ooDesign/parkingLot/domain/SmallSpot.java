package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class SmallSpot extends Spot {
  private static final long RATE = 5;
  private static final SpotSize SIZE = SpotSize.SMALL;

  public SmallSpot(int number) {
    super(number);
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
