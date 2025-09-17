abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }
}

class Car extends Vehicle {
    public Car(String id, String d, double r) { super(id, d, r); }
    public double calculateFare(double distance) { return distance * 10; }
}

class Bike extends Vehicle {
    public Bike(String id, String d, double r) { super(id, d, r); }
    public double calculateFare(double distance) { return distance * 5; }
}

class Auto extends Vehicle {
    public Auto(String id, String d, double r) { super(id, d, r); }
    public double calculateFare(double distance) { return distance * 7; }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class RideDemo {
    public static void main(String[] args) {
        Vehicle v = new Car("C1", "John", 10);
        v.getVehicleDetails();
        System.out.println("Fare: " + v.calculateFare(15));
    }
}
