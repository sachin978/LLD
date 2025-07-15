package DesignProblems.ParkingLot.Big.PaymentStrategy;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;
    public Payment(double amount , PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }
    public void processPaymeny(){
        if(amount > 0 ){
            paymentStrategy.processPayment(amount);
        }else {
            System.out.println(" Invalid paymeny amount. ");
        }
    }
}
