package DesignPatterns.Structural.Decorator;
/*

*/
public class PizzaHut {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraMushroom(new ExtraChees(new Margheretta()));
        System.out.println("Total Cost for margheretta:" + pizza1.cost());
//        BasePizza pizza2 = new VegLoaded(new Margheretta());
//        System.out.println(pizza2.cost());
    }
}
