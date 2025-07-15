package DesignPatterns.Structural.bridge.abstraction;

import DesignPatterns.Structural.bridge.Implementation.Engine;

public class TwoWheeler extends Vehicle{

    public TwoWheeler(Engine engine) {
        super(engine);
    }

    @Override
    public void manufacture() {
        System.out.print("Manufacturing Two Wheeler with ");
        engine.installEngine();
    }
}
