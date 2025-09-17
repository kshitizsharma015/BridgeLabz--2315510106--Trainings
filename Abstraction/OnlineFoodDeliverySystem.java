abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Name: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { return (p * q); }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { return (p * q) + 50; }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class FoodDemo {
    public static void main(String[] args) {
        FoodItem f1 = new NonVegItem("Chicken", 200, 2);
        f1.getItemDetails();
        System.out.println("Total: " + f1.calculateTotalPrice());
    }
}
