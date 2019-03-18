package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class MediumSpot extends Spot {
  private static final long RATE = 8;
  private static final SpotSize SIZE = SpotSize.MEDIUM;

  public MediumSpot(int number) {
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
