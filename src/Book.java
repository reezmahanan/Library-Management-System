public class Book {
    private String name;
    private String author;
    private double price;
    private int count;

    // Parameterized constructor
    public Book(String name, String author, double price, int count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void displayInfo() {
        System.out.println("Title: " + name + " | Author: " + author + " | Price: $" + price + " | Stock: " + count);
    }
}