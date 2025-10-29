public class Book {
    private String name;
    private String title;
    private String id;
    private String author;
    private int count;

    public Book(String name, String title, String id, String author, int count) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.author = author;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "  Title: " + title + "  ID: " + id + " Author: " + author + "  Stock: " + count);
    }
}
