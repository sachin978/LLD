package SOLID.OpenClosedPrinciple;

abstract class Discount{
    public double discount(double price){
        return price * 0.9;
    }
}

class RegularDiscount extends Discount{
    @Override
    public double discount(double price){
        return price * 0.8;
    }
}
class PremiumDiscount extends Discount{
    @Override
    public double discount(double price){
        return price*0.98;
    }
}
class DiscountCalculator{
    public static void main(String[] args) {
        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();
        System.out.println(regular.discount(20));
        System.out.println(premium.discount(100));
    }
}

