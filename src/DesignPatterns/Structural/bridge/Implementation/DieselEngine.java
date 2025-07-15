package DesignPatterns.Structural.bridge.Implementation;

public class DieselEngine implements Engine{
    @Override
    public void installEngine() {
        System.out.println("Installing Diesel Engine");
    }
}
