package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Truck extends Vehicle {
  static final VehicleType type = VehicleType.TRUCK;

  public Truck(int plateNumber) {
    super(plateNumber);
  }
}
