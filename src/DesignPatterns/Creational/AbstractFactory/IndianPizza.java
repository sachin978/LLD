package DesignPatterns.Creational.AbstractFactory;

public class IndianPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("PreParing Indian Pizza!");
    }

    @Override
    public void pizzaType() {
        System.out.println("Indian Veg");
    }
}
