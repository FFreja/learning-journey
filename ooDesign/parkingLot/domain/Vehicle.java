package parkingLot.domain;

import parkingLot.enums.VehicleType;

public abstract class Vehicle {
  VehicleType type;
  private int plateNumber;

  public Vehicle(int plateNumber) {
    this.plateNumber = plateNumber;
  }

  public int getPlateNumber() {
    return plateNumber;
  }

  public VehicleType getType() {
    return type;
  }
}
