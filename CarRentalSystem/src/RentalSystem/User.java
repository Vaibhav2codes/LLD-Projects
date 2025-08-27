package RentalSystem;

public class User {
    String name;
    int id;
    String DrivingLicence;

    public User(String name, int id, String drivingLicence) {
        this.name = name;
        this.id = id;
        DrivingLicence = drivingLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrivingLicence() {
        return DrivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        DrivingLicence = drivingLicence;
    }
}
