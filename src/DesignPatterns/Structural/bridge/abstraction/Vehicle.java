package DesignPatterns.Structural.bridge.abstraction;

import DesignPatterns.Structural.bridge.Implementation.Engine;

public abstract class Vehicle {
    protected Engine engine;            //yaha check

    Vehicle(Engine engine){
        this.engine = engine;
    }
   public abstract void manufacture();
}
