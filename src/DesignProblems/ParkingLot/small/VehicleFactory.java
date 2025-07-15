package DesignProblems.ParkingLot.small;

public class VehicleFactory {

   static Vehicle vehicleFactory(String vehicleType,String license){

        switch(vehicleType){
            case "car":
                return new Car(license);
            case "bike":
                return new Bike(license);
            default:
                throw new IllegalArgumentException("Vehicle not allowed!");
        }
    }
}
