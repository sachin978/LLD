package DesignPatterns.Behavioral.Strategy.Good.Moderate;

public class UPI implements Payment{
    private String upiId ;
    UPI(String id){
        this.upiId = id;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid Amount: " + amount + " using UPI id: " + upiId);
    }
}
