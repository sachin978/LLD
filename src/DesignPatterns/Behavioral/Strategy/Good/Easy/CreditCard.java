package DesignPatterns.Behavioral.Strategy.Good.Easy;

public class CreditCard implements Payment{
    @Override
    public void payment() {
        System.out.println("Payment By CreditCard!");
    }
}
