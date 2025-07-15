package DesignProblems.ParkingLot.Big.ParkingLot;

import DesignProblems.ParkingLot.Big.Vehicle.Vehicle;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(int spotNumber) {
        super(spotNumber, "BIKE");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return true;
    }
}
