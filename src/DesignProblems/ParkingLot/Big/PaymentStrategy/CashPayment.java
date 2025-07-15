package DesignProblems.ParkingLot.Big.PaymentStrategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash Payment of :" + amount);
    }
}
