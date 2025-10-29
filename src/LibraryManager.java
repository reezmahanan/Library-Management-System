import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getName());
    }

    public void removeBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                books.remove(book);
                System.out.println(" Book removed: " + name);
                return;
            }
        }
        System.out.println("Book not found: " + name);
    }

    public void searchBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println(" Book found:");
                book.displayInfo();
                return;
            }
        }
        System.out.println(" Book not found: " + name);
    }

    public void buyBook(String name, int quantity) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                if (book.getCount() >= quantity) {
                    book.setCount(book.getCount() - quantity);
                    System.out.println(" Successfully purchased " + quantity + " copy(ies) of '" + name + "'");
                    System.out.println(" Remaining stock: " + book.getCount());

                    // Remove book if stock becomes 0
                    if (book.getCount() == 0) {
                        books.remove(book);
                        System.out.println(" Book removed from inventory as stock reached zero.");
                    }
                } else {
                    System.out.println(" Insufficient stock! Available: " + book.getCount() + ", Requested: " + quantity);
                }
                return;
            }
        }
        System.out.println(" Book not found: " + name);
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library");
            return;
        }
        System.out.println("=== ALL BOOKS ===");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
