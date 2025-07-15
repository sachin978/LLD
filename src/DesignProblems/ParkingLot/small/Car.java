package DesignProblems.ParkingLot.small;

public class Car implements Vehicle {
    private String licensePlate;
    Car(String licensePlate){
        this.licensePlate= licensePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
}
