package DesignPatterns.Behavioral.Strategy.Good.Easy;

public class UPI implements Payment{
    @Override
    public void payment() {
        System.out.println("Payment By UPI!");
    }
}
