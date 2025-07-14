package DesignProblems.ParkingLot.Vehicle;

public class BikeVehicle extends Vehicle {
    private static final double RATE = 10.0;

    public BikeVehicle(String licensePlate) {
        super(licensePlate, "bike");
    }

    @Override
    public double calculateFee(int hoursStayed) {
        return hoursStayed*RATE;
    }
}
