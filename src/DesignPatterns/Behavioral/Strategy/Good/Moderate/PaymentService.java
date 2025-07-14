package DesignPatterns.Behavioral.Strategy.Good.Moderate;
/*
    Context class
*/
public class PaymentService {
    Payment payment;

    PaymentService(Payment pay){
        this.payment = pay;
    }
    public void pay(int amount){
        payment.pay(amount);
    }
}
