package DesignProblems.ParkingLot.Big.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card Payment of :" + amount);
    }
}
