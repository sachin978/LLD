package SOLID.DependencyInversionPrinciple;

interface Payment{
    void pay();
}
class CreditCardPayments implements Payment{
    public void pay(){
        System.out.println("Payment through Credit Card!");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Payment through UPI!");
    }
}
class PaymentServices{
    Payment p;
    PaymentServices(Payment payment){
        p = payment;
    }
    public void pay(){
        p.pay();
    }
}
public class Good {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayments();
        Payment upi        = new UPI();
        PaymentServices psc = new PaymentServices(creditCard);
        PaymentServices psu = new PaymentServices(upi);
        psc.pay();
        psu.pay();
    }
}
