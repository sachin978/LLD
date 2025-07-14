package DesignPatterns.Behavioral.Strategy.Bad;

/*
Violating Open/Close principle because if any other payment option come then we need to modify existing module thats
why we need to encapsulate in concrete classes because if some other class also using these payment option
derectly then also we can use
 */
public class PaymentService {

    void PayOptions(String payBy){
        switch (payBy){
            case "UPI" :
                System.out.println("Pay By UPI!");
                break;
            case "CC" :
                System.out.println("Pay By CreditCard!");
                break;
            default:
                System.out.println("Cash on Delivery!");
        }
    }
}
