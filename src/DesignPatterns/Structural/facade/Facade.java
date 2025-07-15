package DesignPatterns.Structural.facade;

import DesignPatterns.Structural.facade.BootingClasses.*;
public class Facade {
    private PowerSupply powerSupply;
    private StartFans fans;
    private CPU cpu;
    private Memory memory;

    Facade(){
        powerSupply = new PowerSupply();
        fans = new StartFans();
        cpu = new CPU();
        memory = new Memory();
    }
     void computerStart(){
        powerSupply.powerSupply();
        fans.startFan();
        memory.memory();
        cpu.cpu();
    }
}
