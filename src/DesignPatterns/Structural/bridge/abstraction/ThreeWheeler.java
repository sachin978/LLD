package DesignPatterns.Structural.bridge.abstraction;

import DesignPatterns.Structural.bridge.Implementation.Engine;

public class ThreeWheeler extends Vehicle{

    public ThreeWheeler(Engine engine) {
        super(engine);
    }

    @Override
    public void manufacture() {
        System.out.print("Manufacturing Three Wheeler with ");
        engine.installEngine();
    }
}
