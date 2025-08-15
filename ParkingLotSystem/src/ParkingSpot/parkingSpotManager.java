package ParkingSpot;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class parkingSpotManager {
    ArrayList<parkingSpot> listPS = new ArrayList<>();

    public parkingSpotManager(ArrayList<parkingSpot> List) {
        this.listPS = List;
    }

    public parkingSpot findParkingSpot() {
        for (parkingSpot ps : listPS) {
            if (ps.isEmpty) {
                return ps;
            }
        }
        return null;
    }

    public void addParkingSpot(parkingSpot ps) {
        listPS.add(ps);
        System.out.println("Parking Spot Added id is" + ps.getId());
    }

    public void removeParkingSpot(parkingSpot ps) {
        listPS.add(ps);
        System.out.println("Parking Spot removed id is " + ps.getId());
    }

    public void parkVehicle(parkingSpot ps, Vehicle v) {
        ps.parkVehicle(v);
    }

    public void removeVehicle(parkingSpot ps) {
        ps.removeVehcile();
    }
}
