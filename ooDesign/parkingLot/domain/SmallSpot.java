package parkingLot.domain;

import parkingLot.enums.SpotSize;

public class SmallSpot extends Spot{
    public static final double rate = 5;
    public static final SpotSize size =SpotSize.SMALL;

    public SmallSpot(int number){
        this.number = number;
    }

    @Override
    public int assignTo(Vehicle v) {
        isFree = false;
        return this.number;
    }
}
