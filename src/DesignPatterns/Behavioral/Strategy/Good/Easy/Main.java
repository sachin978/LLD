package DesignPatterns.Behavioral.Strategy.Good.Easy;

public class Main {
    public static void main(String[] args) {
        Payment pay = new CreditCard();
        pay.payment();
    }
}
