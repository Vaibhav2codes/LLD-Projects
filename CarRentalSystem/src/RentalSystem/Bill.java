package RentalSystem;

import java.time.temporal.ChronoUnit;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    Double amount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.amount = computeBillAmount(reservation);
    }

    private double computeBillAmount(Reservation reservation){
        if(reservation.reservationType == ReservationType.DAILY){
            long totalDays = ChronoUnit.DAYS.between(reservation.bookingDateFrom, reservation.bookingDateTo);
            System.out.println("Your Bill amount is " + (reservation.vehicle.pricePerDay * totalDays));
            return reservation.vehicle.pricePerDay * totalDays;
        }
        //Logic for per Hour
        return 0;
    }
}
