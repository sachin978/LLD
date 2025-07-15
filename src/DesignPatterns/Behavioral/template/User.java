package DesignPatterns.Behavioral.template;

public class User extends PaymentFlow{
    @Override
    public void atmJao() {
        System.out.println("Atm aaya!");
    }

    @Override
    public void gharAajao() {
        System.out.println("Ghar vapas gaya!");
    }

    @Override
    public void paiseNikal() {
        System.out.println("Paisa nikala!");
    }
}
