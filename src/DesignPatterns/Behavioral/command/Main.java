package DesignPatterns.Behavioral.command;


import DesignPatterns.Behavioral.command.commands.TurnACOnCommand;
import DesignPatterns.Behavioral.command.commands.TurnOffAcOnCommand;
import DesignPatterns.Behavioral.command.commands.TurnOnTv;
import DesignPatterns.Behavioral.command.invoker.MyRemoteControl;
import DesignPatterns.Behavioral.command.reciever.AirCondition;
import DesignPatterns.Behavioral.command.reciever.TV;

public class Main {
    public static void main(String[] args) {
        AirCondition airCondition = new AirCondition();
        TV tv = new TV();
        MyRemoteControl myRemoteControl = new MyRemoteControl();
        myRemoteControl.setCommand(new TurnACOnCommand(airCondition));
        myRemoteControl.preshButton();
        myRemoteControl.setCommand(new TurnOffAcOnCommand(airCondition));
        myRemoteControl.preshButton();
        myRemoteControl.undo();
        myRemoteControl.setCommand(new TurnOnTv(tv));
        myRemoteControl.preshButton();
        myRemoteControl.undo();
    }
}
