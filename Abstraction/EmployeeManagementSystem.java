abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() { return getBaseSalary(); }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() { return hoursWorked * hourlyRate; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class EmpDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 0, 40, 200);
        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
