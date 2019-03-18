package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Van extends Vehicle {

  public Van(int plateNumber) {
    super(plateNumber);
    super.type = VehicleType.VAN;
  }
}
