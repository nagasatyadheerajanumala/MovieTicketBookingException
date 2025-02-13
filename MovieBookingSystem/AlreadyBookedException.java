package MovieBookingSystem;

public class AlreadyBookedException extends Exception {
  public AlreadyBookedException(String message){
    super(message);
  }
}
