package OOPS.Abstraction;

public class UPI implements PaymentInterface {

    public void pay( int amount){
        System.out.println("Pay by UPI: " + amount);
    }
}
