abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    public Car(String no, double rate) { super(no, rate); }
    public double calculateRentalCost(int days) { return days * 1000; }
}

class Bike extends Vehicle {
    public Bike(String no, double rate) { super(no, rate); }
    public double calculateRentalCost(int days) { return days * 300; }
}

class Truck extends Vehicle {
    public Truck(String no, double rate) { super(no, rate); }
    public double calculateRentalCost(int days) { return days * 2000; }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C1", 1000);
        Vehicle v2 = new Bike("B1", 300);
        System.out.println("Car cost: " + v1.calculateRentalCost(5));
        System.out.println("Bike cost: " + v2.calculateRentalCost(5));
    }
}
