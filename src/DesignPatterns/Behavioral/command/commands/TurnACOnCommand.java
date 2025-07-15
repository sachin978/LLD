package DesignPatterns.Behavioral.command.commands;

import DesignPatterns.Behavioral.command.reciever.AirCondition;

public class TurnACOnCommand implements ICommand{
    AirCondition ac;
    public TurnACOnCommand(AirCondition airCondition){
        this.ac = airCondition;
    }
    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
