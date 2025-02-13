package MovieBookingSystem;

public class Customer extends Thread {
  private String name;
  private Seat seat;
  public Customer(String name, Seat seat, String threadName){
    super(threadName);
    this.name = name;
    this.seat = seat;
  }

  @Override
  public void run(){
    try{
      seat.BookSeat(this.name, Thread.currentThread().getName());
    }
    catch(Exception e){
      System.out.println("Exception occured while booking seat "+ seat.getSeatNumber());
    }
  }
}
