package DesignProblems.ParkingLot.Big.ParkingLot;

import DesignProblems.ParkingLot.Big.Vehicle.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String spotType;

    public ParkingSpot(int spotNumber,String spotType){
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }
    public boolean isOccupied(){
        return isOccupied;
    }
    public abstract boolean canParkVehicle(Vehicle vehicle);
    public void parkVehicle(Vehicle vehicle){
        if(isOccupied)  {
            throw new IllegalStateException("Spot is already occupied.");
        }
        if(!canParkVehicle(vehicle)){
            throw new IllegalArgumentException("This spot is not suitable For a " + vehicle.getVehicleType());
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }
    public void vacate(){
        if(!isOccupied){
            throw new IllegalArgumentException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }
    public int getSpotNumber(){return spotNumber;}
    public Vehicle getVehicle(){return vehicle;}

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + vehicle +
                ", spotType='" + spotType + '\'' +
                '}';
    }
    public String getSpotType(){ return spotType;}
}
