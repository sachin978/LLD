package DesignPatterns.Structural.bridge.Implementation;

public class PetrolEngine implements Engine{
    @Override
    public void installEngine() {
        System.out.println("Installing Petrol Engine");
    }
}
