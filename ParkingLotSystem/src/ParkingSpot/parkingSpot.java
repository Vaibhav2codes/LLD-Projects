package ParkingSpot;

import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class parkingSpot {
    int id;
    Vehicle vehicle;
    protected int price;
    boolean isEmpty;
    public static Map<String,Vehicle> listVehiclesParked = new HashMap<String, Vehicle>();

    public parkingSpot() {
        isEmpty = true;
    }

    public void parkVehicle(Vehicle v) {
        vehicle = v;
        isEmpty = false;
        listVehiclesParked.put(vehicle.getVehicleNumber(),vehicle);
    }

    public void removeVehcile() {
        listVehiclesParked.remove(vehicle.getVehicleNumber(),vehicle);
        vehicle = null;
        isEmpty = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }
}
