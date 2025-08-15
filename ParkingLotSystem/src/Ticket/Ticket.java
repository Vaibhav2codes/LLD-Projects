package Ticket;

import Vehicle.Vehicle;
import ParkingSpot.parkingSpot;

import java.util.HashMap;
import java.util.Map;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    parkingSpot spot;
    static Map<String,Ticket> listTickets = new HashMap<>();

    public Ticket(long entryTime, Vehicle vehicle, parkingSpot spot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public parkingSpot getSpot() {
        return spot;
    }

    public void generateTicket() {
        System.out.println("You parked your" + vehicle.getVehicleType() + "vehicle with number" + vehicle.getVehicleNumber() + "at parking spot : " + spot.getId() + "at time" + entryTime);
        listTickets.put(vehicle.getVehicleNumber(),this);
    }

    public static Ticket getTicket(String VehicleNumber){
        if(listTickets.containsKey(VehicleNumber)){
            return listTickets.get(VehicleNumber);
        }

        return null;
    }
}
