package MovieBookingSystem;

public class Seat {
  private int seatNumber;
  private boolean isBooked = false;

  public Seat(int seatNumber){
    this.seatNumber = seatNumber;
  }

  public int getSeatNumber(){
    return seatNumber;
  }
  public void BookSeat(String customerName, String name) throws AlreadyBookedException{
    System.out.println("Running " + name);
    System.out.println("Guest "+customerName + "is trying to book seat number " + seatNumber);
    if(isBooked){
      throw new AlreadyBookedException("Sorry, this seat is already booked!");
    }
    try{
      Thread.sleep(1000);
    }catch(Exception e){
      System.out.println("Exception happened while running the " + name + "and the exception is "+ e.getMessage());
    }
    isBooked = true;
    System.out.println("Seat number" + seatNumber + "is booked by " + customerName);
  }
}
