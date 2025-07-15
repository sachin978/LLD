package DesignPatterns.Behavioral.command.commands;

import DesignPatterns.Behavioral.command.reciever.AirCondition;

public class TurnOffAcOnCommand implements ICommand{
    AirCondition ac;

    public TurnOffAcOnCommand(AirCondition airCondition){
        this.ac = airCondition;
    }
    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
