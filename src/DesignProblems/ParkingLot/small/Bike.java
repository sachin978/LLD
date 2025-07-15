package DesignProblems.ParkingLot.small;

public class Bike implements Vehicle {
    private String licensePlate;
    Bike(String licensePlate){
        this.licensePlate = licensePlate;
    }

    @Override
    public String getLicensePlate() {
        return this.licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

}
