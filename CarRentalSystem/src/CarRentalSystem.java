import RentalSystem.*;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(users,stores);

        User user = users.get(0);

        Location location = new Location("12AB","Hyderabad","Telangana",500032);
        Store store = VehicleRentalSystem.getStore(location);

        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        Reservation reservation = store.createReservation(storeVehicles.get(0), user,"2025-08-01" , "2025-08-04");

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.payBill(bill);

        store.completeReservation(reservation.getId());
    }

    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setId(1);
        vehicle1.setVehicleType(VehicleType.CAR);
        vehicle1.setPricePerDay(700);

        Vehicle vehicle2 = new Car();
        vehicle2.setId(2);
        vehicle2.setVehicleType(VehicleType.CAR);
        vehicle2.setPricePerDay(800);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User("Vaibhav",1,"dv1");
        User user2 = new User("Rahul",2,"dv2");

        users.add(user1);
        users.add(user2);

        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Location loc1 = new Location("12AB","Hyderabad","Telangana",500032);
        Store store1 = new Store(1,vehicles,loc1);
        stores.add(store1);
        return stores;
    }

}
