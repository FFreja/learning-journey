package parkingLot.domain;

import parkingLot.enums.VehicleType;

public abstract class Vehicle {
  int plateNumber = 0;
  VehicleType type;

  public Vehicle(int plateNumber) {
    this.plateNumber = plateNumber;
  }

  public int getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(int plateNumber) {
    this.plateNumber = plateNumber;
  }

  public VehicleType getType() {
    return type;
  }

  public void setType(VehicleType type) {
    this.type = type;
  }
}
