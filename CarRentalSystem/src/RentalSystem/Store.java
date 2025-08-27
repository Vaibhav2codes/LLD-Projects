package RentalSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public void setStoreLocation(Location storeLocation) {
        this.storeLocation = storeLocation;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Store(int storeId, List<Vehicle>listVehicles,Location location) {
        this.storeId = storeId;
        this.vehicleInventoryManagement = new VehicleInventoryManagement(listVehicles);
        this.storeLocation = location;
    }

    public Reservation createReservation(Vehicle vehicle, User user, String fromDate,String  toDate){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle,LocalDate.parse(fromDate),LocalDate.parse(toDate));
        reservations.add(reservation);
        return reservation;
    }


    public boolean completeReservation(int id){
        reservations.removeIf(reservation -> reservation.id == id);
        return true;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return vehicleInventoryManagement.getVehicleOnType(vehicleType);
    }
}
