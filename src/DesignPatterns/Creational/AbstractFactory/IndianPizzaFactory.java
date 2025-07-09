package DesignPatterns.Creational.AbstractFactory;

public class IndianPizzaFactory implements PizzaFactory{
    @Override
    public IndianPizza createPizza() {
        return new IndianPizza();
    }
}
