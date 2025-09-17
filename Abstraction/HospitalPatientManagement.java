abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    public InPatient(int id, String n, int a) { super(id, n, a); }
    public double calculateBill() { return 10000; }
}

class OutPatient extends Patient {
    public OutPatient(int id, String n, int a) { super(id, n, a); }
    public double calculateBill() { return 2000; }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class HospitalDemo {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Alice", 30);
        p.getPatientDetails();
        System.out.println("Bill: " + p.calculateBill());
    }
}
