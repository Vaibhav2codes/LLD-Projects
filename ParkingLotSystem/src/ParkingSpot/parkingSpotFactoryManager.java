package ParkingSpot;

import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class parkingSpotFactoryManager {
    public parkingSpotManager parkingSpotFactoryManager(Vehicle v) {
        if (v.getVehicleType() == VehicleType.TWO_WHEELER) return new twoWheelerParkingSpotManager();
        else if (v.getVehicleType() == VehicleType.FOUR_WHEELER) return new fourWheelerParkingSpotManager();

        return null;
    }
}
