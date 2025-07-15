package DesignProblems.ParkingLot.small;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingLots = new ArrayList<>();

    public ParkingLot(int capacity) {
        for(int i=0;i<capacity;i++){
            parkingLots.add(new ParkingSpot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for( ParkingSpot spot : parkingLots){
            if(spot.isEmpty()){
                spot.setVehicle(vehicle);
                spot.setEmpty(false);
                System.out.println("Parked successfully on spotNumber:" + spot.getSpotNumber());
                return;
            }
        }
    }
    public void removeVehicle(Vehicle vehicle){

        for( ParkingSpot spot : parkingLots){

            if(!spot.isEmpty() && spot.getVehicle().getLicensePlate().equals(vehicle.getLicensePlate())){
                String vehicleNumber = spot.getVehicle().getLicensePlate();
                spot.setVehicle(null);
                spot.setEmpty(true);
                System.out.println("Vehicle No. "+ vehicleNumber + " successfully exited from spotNumber:" + spot.getSpotNumber() );
                return;
            }
        }
        System.out.println("No vehicle Found!");
    }

}
