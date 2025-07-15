package DesignPatterns.Behavioral.command.commands;

import DesignPatterns.Behavioral.command.reciever.TV;

public class TurnOnTv implements ICommand{
    TV tv;
    public TurnOnTv(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.tvSwitchOn();
    }

    @Override
    public void undo() {
        tv.tvSwitchOff();
    }
}
