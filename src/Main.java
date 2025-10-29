import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Search Book");
            System.out.println("5. Buy Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Book Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook = new Book(name, title, id, author, quantity);
                    manager.addBook(newBook);
                    break;

                case 2:
                    manager.showAllBooks();
                    break;

                case 3:
                    System.out.print("Enter Book Name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeBook(removeName);
                    break;

                case 4:
                    System.out.print("Enter Book Name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchBook(searchName);
                    break;

                case 5:
                    System.out.print("Enter Book Name to buy: ");
                    String buyName = scanner.nextLine();

                    System.out.print("Enter quantity to buy: ");
                    int buyQuantity = scanner.nextInt();
                    scanner.nextLine();

                    manager.buyBook(buyName, buyQuantity);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Invalid choice! Please try again.\n");
            }
        }
    }
}

