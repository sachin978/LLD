package DesignProblems.ParkingLot.small;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);
        Vehicle vehicle1 = VehicleFactory.vehicleFactory("car", "mp 30");
//        Vehicle vehicle2 = new Vehicle(new Bike("mp 07 8080"));

//        parkingLot.parkVehicle(vehicle1);
        parkingLot.removeVehicle(vehicle1);

    }
}
