package DesignPatterns.Behavioral.command.reciever;

public class TV {
    boolean On;

    public void tvSwitchOn(){
        System.out.println("Tv is On!");
    }

    public void tvSwitchOff(){
        System.out.println("Tv is off! ");
    }

}
