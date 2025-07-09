package DesignPatterns.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        PizzaFactory indianPizzaFactory = new IndianPizzaFactory();
        Pizza indianPizza =   indianPizzaFactory.createPizza();
        indianPizza.prepare();
    }
}
