package RentalSystem;

import java.time.LocalDate;

public class Reservation {
    static int resId = 1;
    int id;
    User user;
    Vehicle vehicle;
    LocalDate bookingDate;
    LocalDate bookingDateFrom;
    LocalDate bookingDateTo;
    long fromTimeStamp;
    long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;

    public void createReserve(User user, Vehicle vehicle, LocalDate bookingDateFrom , LocalDate bookingDateTo){
        id = resId++;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = LocalDate.now();
        this.bookingDateFrom = bookingDateFrom;
        this.bookingDateTo = bookingDateTo;
        reservationStatus = ReservationStatus.SCHEDULED;
        reservationType = ReservationType.DAILY;
        printReservation();
    }

    public void printReservation(){
        System.out.println("Your reservation has been successfully scheduled from " + bookingDateFrom + " to " + bookingDateTo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getBookingDateFrom() {
        return bookingDateFrom;
    }

    public void setBookingDateFrom(LocalDate bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
    }

    public LocalDate getBookingDateTo() {
        return bookingDateTo;
    }

    public void setBookingDateTo(LocalDate bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
    }

    public long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public long getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(long toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }
}
