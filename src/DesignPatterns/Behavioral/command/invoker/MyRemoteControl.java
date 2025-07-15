package DesignPatterns.Behavioral.command.invoker;

import DesignPatterns.Behavioral.command.commands.ICommand;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> commandHistory = new Stack<>();
    public MyRemoteControl(){}
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void preshButton(){
        command.execute();
        commandHistory.add(command);
    }
    public void undo(){
        ICommand lastCommand = commandHistory.pop();
        lastCommand.undo();
    }
}
