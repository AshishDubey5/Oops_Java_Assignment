package Case_Study5;

import java.util.Scanner;

class Book {

    int bookId;
    String bookTitle;
    String author;
    boolean available;

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (available ? "Available" : "Issued"));
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter Book ID: ");
        book.bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        book.bookTitle = sc.nextLine();

        System.out.print("Enter Author: ");
        book.author = sc.nextLine();

        System.out.print("Is the book available? (true/false): ");
        book.available = sc.nextBoolean();

        book.displayBook();

        System.out.print("\nDo you want to issue the book? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            book.issueBook();
        }

        book.displayBook();

        System.out.print("\nDo you want to return the book? (yes/no): ");
        choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            book.returnBook();
        }

        book.displayBook();

        sc.close();
    }
}
