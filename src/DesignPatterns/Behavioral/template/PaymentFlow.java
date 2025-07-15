package DesignPatterns.Behavioral.template;

public abstract class PaymentFlow {
    public abstract void atmJao();
    public abstract void gharAajao();
    public abstract void paiseNikal();
    public final void hierarchy(){
        atmJao();
        paiseNikal();
        gharAajao();
    }
}
