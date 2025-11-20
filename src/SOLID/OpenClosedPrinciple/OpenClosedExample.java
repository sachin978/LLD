package SOLID.OpenClosedPrinciple;

/*
Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.”
 */

// Abstraction for discount calculation
interface Discount {
    double applyDiscount(double price);
}

// Different discount strategies
class RegularDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% off
    }
}

class PremiumDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.80; // 20% off
    }
}

class SuperPremiumDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.50; // 50% off
    }
}

// Calculator that uses the discount strategy
class DiscountCalculator {
    private final Discount discount;

    public DiscountCalculator(Discount discount) {
        this.discount = discount;
    }

    public double calculate(double price) {
        return discount.applyDiscount(price);
    }
}

// Main app
public class OpenClosedExample {
    public static void main(String[] args) {
        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();
        Discount superPremium = new SuperPremiumDiscount();

        DiscountCalculator calculator1 = new DiscountCalculator(regular);
        DiscountCalculator calculator2 = new DiscountCalculator(premium);
        DiscountCalculator calculator3 = new DiscountCalculator(superPremium);

        System.out.println("Regular customer pays: " + calculator1.calculate(1000));
        System.out.println("Premium customer pays: " + calculator2.calculate(1000));
        System.out.println("Super Premium customer pays: " + calculator3.calculate(1000));
    }
}
