# Classic OO design - Parking Lot

## Start from Basic - 1 parking Lot with 1 level parking, 1 entry, 1 exit
### Use cases (It is easier if you think it with function flow.)
- A vehicle entered.
   - User enter data to the system. It records enter date, vehicle size, generate a ticket id.
   - System find valid spot and assign it to this vehicle. Status of vehicle need to be updated.
- A vehicle left.
   - User swipe the ticket to read spot price rate, parking hours and calculate price.
   - User pay it in cash.(profit, revenue is out of scope)
   - System remove this vehicle from spot, set spot back to free.
     
### Objects list
- Parking Lot: list of spots. 
- Vehicle (Car, Van, Truck): plateNumber, size.
- Spot (Small, Medium, Large) : number, type, status, rate. 
  - assignToVehicle: relate a spot to a vehicle. update status of spot. 
  - returnSpot: set spot status back to free and remove the vehicle attached on it.
- Ticket : Id, enterAt, exitAt, vehicle, spot, amount. 

- TicketSystem
    - generateTicket: connect spot with vehicle. issue a new ticket.
    - complete: update ticket status to DB.
- PaymentSystem
    - checkout: get total price of parking
  
  **Parking lot has spots, ticket service, payment service**  
  
  **Ticket has vehicle and spot**
  
  **Spot has vehicle**
 

### Code sample (java)
![](https://github.com/FFreja/learning-journey/blob/master/resources/parkinglot.jpg)
