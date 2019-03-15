package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Car extends Vehicle {

  static final VehicleType type = VehicleType.CAR;

  public Car(int plateNumber) {
    super(plateNumber);
  }
}
