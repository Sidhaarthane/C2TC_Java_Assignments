package Assignment3.Main;

import Assignment3.Items.Book;
import Assignment3.Items.Magazine;
import Assignment3.library.library;

/**
 * Main class for Assignment 3
 */
public class Assignment3Main {
    public static void main(String[] args) {
        
        // Part A - Inheritance demonstration
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        // Show individual details
        System.out.println("=== Inheritance Demo ===");
        book.displayInfo();
        magazine.displayInfo();

        // Part B - Composition demonstration
        library lib = new library();   // ✅ fixed class name and variable name
        lib.addItem(book);
        lib.addItem(magazine);

        System.out.println("\n=== Composition Demo ===");
        lib.showAllItems();
    }
}
