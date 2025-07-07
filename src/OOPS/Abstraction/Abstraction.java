package OOPS.Abstraction;
public class Abstraction {

    public static void main(String[] args) {

        PaymentInterface p1 = new CreditCard();
        PaymentInterface p2 = new UPI();
        p1.pay(12);
        p2.pay(42);
//      p1.normalFunction();  this will not work because it is not defined in interface
    }
}
