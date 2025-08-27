package RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    static List<User> userList = new ArrayList<>();
    static List<Store> storeList =  new ArrayList<>();

    public VehicleRentalSystem(List<User> userList, List<Store> storeList) {
        this.userList = userList;
        this.storeList = storeList;
    }

    public static Store getStore(Location location){
        for(Store store : storeList){
            if(store.storeLocation.city==location.city){
                return store;
            }
        }
        return null;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public void addStore(Store store){
        storeList.add(store);
    }

    public void removeStore(Store store){
        storeList.remove(store);
    }
}
