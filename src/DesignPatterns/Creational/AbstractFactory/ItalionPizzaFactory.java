package DesignPatterns.Creational.AbstractFactory;

public class ItalionPizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza() {
        return new ItalianPizza();
    }
}
