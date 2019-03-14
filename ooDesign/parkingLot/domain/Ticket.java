package parkingLot.domain;

import java.util.Date;


public class Ticket {
    int id;
    Date enterAt;
    Date exitAt;
    Vehicle vehicle;
    Spot spot;
}
