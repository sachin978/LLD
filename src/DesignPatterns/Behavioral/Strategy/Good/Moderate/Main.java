package DesignPatterns.Behavioral.Strategy.Good.Moderate;
/*
    Refer notes
*/
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCard("1234 5678 9098 4567"));
        paymentService.pay(1200);
        PaymentService paymentService1 = new PaymentService(new UPI("mera@ybl"));
        paymentService1.pay(500);
    }
}
