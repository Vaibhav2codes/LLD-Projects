package RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehiclesList;

    public VehicleInventoryManagement(List<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    public List<Vehicle> getVehicles() {
        //filtering
        return vehiclesList;
    }

    public List<Vehicle> getVehicleOnType(VehicleType vehicleType){
        List<Vehicle> listVehicles = new ArrayList<>();
        for(Vehicle vehicle : vehiclesList){
            if(vehicle.vehicleType == vehicleType){
                listVehicles.add(vehicle);
            }
        }
        return listVehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehiclesList = vehicles;
    }

}
