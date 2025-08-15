import Gates.entranceGate;
import Gates.exitGate;
import ParkingSpot.*;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

import static ParkingSpot.parkingSpot.listVehiclesParked;

public class main {
    public static void main(String[] args) throws Exception {
        //Create parking managers
        twoWheelerParkingSpotManager twoWheelerManager = new twoWheelerParkingSpotManager();
        fourWheelerParkingSpotManager fourWheelerManager = new fourWheelerParkingSpotManager();

        // Add parking spots
        for (int i = 1; i <= 10; i++) {
            twoWheelerParkingSpot spot = new twoWheelerParkingSpot();
            spot.setId(i);
            spot.setPrice();
            twoWheelerManager.addParkingSpot(spot);
        }
        for (int i = 101; i <= 110; i++) {
            fourWheelerParkingSpot spot = new fourWheelerParkingSpot();
            spot.setId(i);
            spot.setPrice();
            fourWheelerManager.addParkingSpot(spot);
        }

        parkingSpotFactoryManager factory = new parkingSpotFactoryManager();

        Vehicle[] vehicles = {
                new Vehicle("KA01AB1111", VehicleType.TWO_WHEELER),
                new Vehicle("KA01AB2222", VehicleType.TWO_WHEELER),
                new Vehicle("KA01AB3333", VehicleType.TWO_WHEELER),
                new Vehicle("KA01AB4444", VehicleType.TWO_WHEELER),
                new Vehicle("KA02CD5555", VehicleType.FOUR_WHEELER),
                new Vehicle("KA02CD6666", VehicleType.FOUR_WHEELER),
                new Vehicle("KA02CD7777", VehicleType.FOUR_WHEELER),
                new Vehicle("KA02CD8888", VehicleType.FOUR_WHEELER),
                new Vehicle("KA02CD9999", VehicleType.FOUR_WHEELER),
                new Vehicle("KA02CD0000", VehicleType.FOUR_WHEELER)
        };

        for (Vehicle v : vehicles) {
            parkingSpotManager manager = factory.parkingSpotFactoryManager(v);
            entranceGate gate = new entranceGate(factory, manager);
            gate.findSpace(v);
        }

        String[] exitingVehicles = {
                "KA02CD5555", "KA01AB3333", "KA02CD0000"
        };

        for (String vehicleNumber : exitingVehicles) {
            Ticket ticket = Ticket.getTicket(vehicleNumber);

            if (ticket == null) {
                System.out.println("No ticket found for vehicle: " + vehicleNumber);
                continue;
            }

            exitGate eGate = new exitGate(
                    ticket,
                    factory.parkingSpotFactoryManager(listVehiclesParked.get(vehicleNumber))
            );
            eGate.payment();
        }
    }
}
