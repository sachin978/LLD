package OOPS.Abstraction;

public class CreditCard implements PaymentInterface{
    @Override
    public void pay( int amount){
        System.out.println("Pay by creditCard: " + amount);
    }
    public void normalFunction(){
        System.out.println("Credit Card normal function");
    }
}
