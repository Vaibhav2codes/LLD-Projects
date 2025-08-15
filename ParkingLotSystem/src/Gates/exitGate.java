package Gates;

import ParkingSpot.parkingSpotManager;
import Ticket.Ticket;

import java.util.Scanner;

public class exitGate {
    Ticket ticket;
    parkingSpotManager psManager;

    public exitGate(Ticket ticket, parkingSpotManager psManager) {
        this.ticket = ticket;
        this.psManager = psManager;
    }

    public void payment() {
        int amountToPay = ticket.getSpot().getPrice();
        System.out.println("\"Please pay: ₹" + amountToPay);
        Scanner sc = new Scanner(System.in);
        int paidAmount =0;
        while (true) {
            System.out.print("Enter payment amount: ₹");
             paidAmount = paidAmount + sc.nextInt();

            if (amountToPay - paidAmount == 0) {
                updateParkingSpot();
                break;
            }
            else if(paidAmount - amountToPay> 0){
                updateParkingSpot();
                System.out.println("Here is your change " + (paidAmount-amountToPay));
                break;
            }else {
                System.out.println("Please pay remaining amount " + (amountToPay - paidAmount));
            }
        }
    }

    public void updateParkingSpot() {
        psManager.removeVehicle(ticket.getSpot());
        System.out.println("Parking spot id " + ticket.getSpot().getId() + " is being emptied");
    }
}
