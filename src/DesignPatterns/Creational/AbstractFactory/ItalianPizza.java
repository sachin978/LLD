package DesignPatterns.Creational.AbstractFactory;

public class ItalianPizza implements Pizza{
    @Override
    public void prepare() {
    System.out.println("Italian Pizza Getting prepard!");
    }

    @Override
    public void pizzaType() {
        System.out.println("Italian To non-Veg!");
    }
}
