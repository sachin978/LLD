package DesignProblems.ParkingLot.Big.ParkingLot;

import DesignProblems.ParkingLot.Big.Vehicle.Vehicle;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotNumber) {
        super(spotNumber, "Car");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return true;
    }
}
