package DesignPatterns.Behavioral.Strategy.Bad;

/*

 */

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService  = new PaymentService();
        paymentService.PayOptions("UPI");
    }
}
