package DesignPatterns.Structural.Decorator;

public class ExtraMushroom extends ToppinsDecorator{
    private BasePizza basePizza;
    public ExtraMushroom(BasePizza extra) {
        this.basePizza = extra;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
