package DesignProblems.ParkingLot.Big.PaymentStrategy;

public class UPI implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of :" + amount);
    }
}
