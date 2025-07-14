package DesignProblems.ParkingLot.Ticket;

import DesignProblems.ParkingLot.Vehicle.ParkingSpot;
import DesignProblems.ParkingLot.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private LocalDateTime startTime;
    private Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.startTime = LocalDateTime.now();
        this.vehicle = vehicle;
    }
}
