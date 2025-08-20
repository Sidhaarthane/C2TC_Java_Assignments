package Assignment3.Items;

/**
 * Base class Item (Super class)
 */
public class Item {
    protected int id;
    protected String title;

    // Constructor
    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Method to display item info
    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}