package DesignPatterns.Structural.bridge;

import DesignPatterns.Structural.bridge.Implementation.CngEngine;
import DesignPatterns.Structural.bridge.Implementation.PetrolEngine;
import DesignPatterns.Structural.bridge.abstraction.ThreeWheeler;
import DesignPatterns.Structural.bridge.abstraction.TwoWheeler;
import DesignPatterns.Structural.bridge.abstraction.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle bike = new TwoWheeler(new PetrolEngine());
        bike.manufacture();
        Vehicle auto = new ThreeWheeler(new CngEngine());
        auto.manufacture();
    }
}
