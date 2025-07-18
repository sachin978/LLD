package SOLID.DependencyInversionPrinciple;

/*
In this example if we want to pay with UPI in future then we need to create a class upi and also need to
change in Payment service which is not a best practice so thats why we need to make it generic how? see in good

Higher class should not depends upon lower class as in the example PaymentService is a higher class
and it is using object of lower class which is a bad practice.
 */
class CreditCardPayment{
    void pay(){
        System.out.println("Credit card Payment!");
    }
}
class PaymentService{
    CreditCardPayment creditPayment;
     PaymentService(){
        creditPayment = new CreditCardPayment();
    }
    void pay(){
        creditPayment.pay();
    }
}

public class Bad {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.pay();
    }
}