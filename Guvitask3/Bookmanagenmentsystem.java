package Guvitask3;

import java.util.Scanner;

public class Bookmanagenmentsystem {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();
	        
	        while (true) {
	            System.out.println("\nLibrary Menu:");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Display Books");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Book Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Author Name: ");
	                    String author = scanner.nextLine();
	                    library.addBook(new Book(id, title, author));
	                    break;
	                case 2:
	                    System.out.print("Enter Book ID to remove: ");
	                    int removeId = scanner.nextInt();
	                    library.removeBook(removeId);
	                    break;
	                case 3:
	                    System.out.print("Enter Book ID to search: ");
	                    int searchId = scanner.nextInt();
	                    Book book = library.searchBook(searchId);
	                    if (book != null) {
	                        System.out.println("Book Found: " + book);
	                    } else {
	                        System.out.println("Book not found.");
	                    }
	                    break;
	                case 4:
	                    library.displayBooks();
	                    break;
	                case 5:
	                    System.out.println("Exiting Library System...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
