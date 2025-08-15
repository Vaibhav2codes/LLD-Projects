package ParkingSpot;

import java.util.ArrayList;

public class twoWheelerParkingSpotManager extends parkingSpotManager {
    static ArrayList<parkingSpot> twoWheelerPSList = new ArrayList<>();

    public twoWheelerParkingSpotManager() {
        super(twoWheelerPSList);
    }
}
