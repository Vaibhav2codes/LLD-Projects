package Gates;

import ParkingSpot.parkingSpot;
import ParkingSpot.parkingSpotFactoryManager;
import ParkingSpot.parkingSpotManager;
import Ticket.Ticket;
import Vehicle.Vehicle;

public class entranceGate {
    parkingSpotFactoryManager psFactoryManager;
    parkingSpotManager psManager;

    public entranceGate(parkingSpotFactoryManager psFactoryManager, parkingSpotManager psManager) {
        this.psFactoryManager = psFactoryManager;
        this.psManager = psManager;
    }

    public void findSpace(Vehicle v) {
        parkingSpot ps = psManager.findParkingSpot();
        if (ps != null) bookSpot(ps, v);
        else {
            System.out.println("No Parking Spot Available");
        }
    }

    public void bookSpot(parkingSpot ps, Vehicle v) {
        updateParkingSpot(ps, v);
    }

    public void updateParkingSpot(parkingSpot ps, Vehicle v) {
        psManager.parkVehicle(ps, v);
        generateTicket(ps, v);
    }

    public void generateTicket(parkingSpot ps, Vehicle v) {
        Ticket ticket = new Ticket(System.currentTimeMillis(), v, ps);
        ticket.generateTicket();
    }

}
