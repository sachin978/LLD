package DesignPatterns.Behavioral.command.commands;

import DesignPatterns.Behavioral.command.reciever.TV;

public class TurnTvOff implements ICommand{

    TV tv;
    public TurnTvOff(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.tvSwitchOff();
    }

    @Override
    public void undo() {
        tv.tvSwitchOn();
    }
}
