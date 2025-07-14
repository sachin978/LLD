package DesignProblems.ParkingLot.Vehicle;
/*
Agar abstract class me arg constructor hai then humko concrete class me usko call karna padega
 */
public class CarVehicle extends Vehicle {
    private  static final double RATE = 10.0;

    public CarVehicle(String licensePlate){
        super(licensePlate,"car");
    }
    @Override
    public double calculateFee(int hoursStayed) {
        return hoursStayed*RATE;
    }
}
