package DesignPatterns.Structural.bridge.Implementation;

public class CngEngine implements Engine {
    @Override
    public void installEngine() {
        System.out.println("Installing CNG Engine");
    }
}
