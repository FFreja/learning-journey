package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Truck extends Vehicle {

  public Truck(int plateNumber) {
    super(plateNumber);
    super.type = VehicleType.TRUCK;
  }
}
