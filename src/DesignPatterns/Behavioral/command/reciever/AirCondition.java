package DesignPatterns.Behavioral.command.reciever;

public class AirCondition {
    boolean on ;
    int temperature;

    public void turnOnAc(){
        on = true;
        System.out.println("AC is on");
    }
    public void turnOff(){
        on = false;
        System.out.println("AC is off");
    }
    public void setTemperature(int temprature){
        this.temperature = temprature;
    }

}
