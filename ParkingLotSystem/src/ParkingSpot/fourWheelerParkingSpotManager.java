package ParkingSpot;

import java.util.ArrayList;

public class fourWheelerParkingSpotManager extends parkingSpotManager {
    static ArrayList<parkingSpot> fourWheelerPSList = new ArrayList<>();

    public fourWheelerParkingSpotManager() {
        super(fourWheelerPSList);
    }
}