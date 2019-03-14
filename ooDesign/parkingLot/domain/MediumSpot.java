package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class MediumSpot extends Spot{
    public static final double rate = 8;
    public static final SpotSize size =SpotSize.MEDIUM;

    public MediumSpot(int number){
        this.number = number;
    }

    @Override
    public int assignTo(Vehicle v) {
        isFree = false;
        return this.number;
    }
}
