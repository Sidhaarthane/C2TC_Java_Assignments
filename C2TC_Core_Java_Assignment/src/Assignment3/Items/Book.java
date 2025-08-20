package Assignment3.Items;

/**
 * Subclass Book - IS-A Item
 */
public class Book extends Item {
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        super(id, title); // call parent constructor
        this.author = author;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
    }

    public String getAuthor() {
        return author;
    }
}
