package DesignPatterns.Structural.Decorator;

public class ExtraChees extends ToppinsDecorator{
    private BasePizza basePizza;
    public ExtraChees(BasePizza extra) {
        this.basePizza = extra;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
