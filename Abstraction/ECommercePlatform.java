abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public abstract double calculateDiscount();
}

class Electronics extends Product {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class EcomDemo {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        System.out.println(p1.getName() + " Final Price: " + (p1.getPrice() - p1.calculateDiscount()));
        System.out.println(p2.getName() + " Final Price: " + (p2.getPrice() - p2.calculateDiscount()));
    }
}
