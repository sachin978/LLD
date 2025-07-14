package DesignPatterns.Behavioral.Strategy.Good.Moderate;

public class CreditCard implements Payment{
    String creditCardNumber;
    CreditCard(String number){
        this.creditCardNumber = number;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid amout: " + amount + " from credit card number: " + creditCardNumber);
    }
}
