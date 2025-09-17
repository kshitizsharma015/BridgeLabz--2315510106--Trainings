abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem {
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 3; }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java Basics", "John");
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
    }
}
