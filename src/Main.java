import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        boolean running = true;

        while (running) {
            System.out.println("######## Welcome to Library Management System! ########");
            System.out.println("Press 1 for Adding a Book");
            System.out.println("Press 2 for Removing a Book");
            System.out.println("Press 3 for Searching Books");
            System.out.println("Press 4 for Buying a Book");
            System.out.println("Press 5 for Viewing all Books");
            System.out.println("Press 6 to Exit system");
            System.out.print("Choose Your option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter book price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter book quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Book newBook = new Book(title, author, price, quantity);
                    manager.addBook(newBook);
                    break;

                case 2: // Remove Book
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    manager.removeBook(removeTitle);
                    break;

                case 3: // Search Book
                    System.out.print("Enter book title or author to search: ");
                    String searchTerm = scanner.nextLine();
                    manager.searchBook(searchTerm);
                    break;

                case 4: // Buy Book
                    System.out.print("Enter book title to buy: ");
                    String buyTitle = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int buyQuantity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    manager.buyBook(buyTitle, buyQuantity);
                    break;

                case 5: // View All Books
                    manager.displayAllBooks();
                    break;

                case 6: // Exit
                    System.out.println("Exiting system....");
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
}