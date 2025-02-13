package MovieBookingSystem;

public class TicketBooking {
  public static void main(String[] args) {
    Seat seat = new Seat(100);
    Thread t1 = new Customer("dheeraj", seat, "Thread 1");
    Thread t2 = new Customer("Aayush", seat, "Thread 2");
    Thread t3 = new Customer("Himani", seat, "Thread 3");
    t1.start();
    t2.start();
    t3.start();
  }
  
}
