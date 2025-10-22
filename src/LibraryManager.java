import java.util.ArrayList;

public class LibraryManager {
    // Book ArrayList
    private ArrayList<Book> bookArray = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        bookArray.add(book);
        System.out.println("Book added successfully!\n");
    }

    // Remove book
    public void removeBook(String bookName) {
        boolean found = false;
        for (Book book : bookArray) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                bookArray.remove(book);
                System.out.println("Book removed successfully!");
                found = true;
                break; // exit loop immediately after removing
            }
        }
        if (!found) {
            System.out.println("No Book found with title: " + bookName + "\n");
        }
    }

    // Search book
    public void searchBook(String searchTerm) {
        boolean found = false;
        System.out.println("Search results for: " + searchTerm);
        for (Book book : bookArray) {
            if (book.getName().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(searchTerm.toLowerCase())) {
                book.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching: " + searchTerm + "\n");
        } else {
            System.out.println();
        }
    }

    // Buy book
    public void buyBook(String bookName, int quantity) {
        boolean found = false;
        for (Book book : bookArray) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                found = true;
                if (book.getCount() >= quantity) {
                    book.setCount(book.getCount() - quantity);
                    double totalPrice = book.getPrice() * quantity;
                    System.out.println("Successfully purchased " + quantity + " copy(ies) of '" + bookName + "'");
                    System.out.println("Total cost: $" + totalPrice);
                    System.out.println("Remaining stock: " + book.getCount() + "\n");

                    // Remove book if stock becomes 0
                    if (book.getCount() == 0) {
                        bookArray.remove(book);
                        System.out.println("Book removed from inventory as stock reached zero.\n");
                    }
                } else {
                    System.out.println("Insufficient stock! Available: " + book.getCount() + ", Requested: " + quantity + "\n");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("No Book found with title: " + bookName + "\n");
        }
    }

    // Display all books
    public void displayAllBooks() {
        if (bookArray.isEmpty()) {
            System.out.println("No books in the library.\n");
            return;
        }
        System.out.println("=== All Books in Library ===");
        for (Book book : bookArray) {
            book.displayInfo();
        }
        System.out.println();
    }
}