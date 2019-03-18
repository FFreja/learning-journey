package parkingLot.domain;

import parkingLot.enums.VehicleType;

public class Car extends Vehicle {

  public Car(int plateNumber) {
    super(plateNumber);
    super.type = VehicleType.CAR;
  }
}
