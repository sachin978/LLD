package DesignProblems.ParkingLot.Vehicle;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("car")){
            return new CarVehicle(vehicleType);
        }else if(vehicleType.equalsIgnoreCase("bike")){
            return new BikeVehicle(vehicleType);
        }
        return null;
    }
}
