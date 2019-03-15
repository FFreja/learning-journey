package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Van extends Vehicle {
  static final VehicleType type = VehicleType.VAN;

  public Van(int plateNumber) {
    super(plateNumber);
  }
}