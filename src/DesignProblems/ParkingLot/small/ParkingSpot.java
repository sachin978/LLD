package DesignProblems.ParkingLot.small;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle = null;
    private boolean isEmpty = true;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
