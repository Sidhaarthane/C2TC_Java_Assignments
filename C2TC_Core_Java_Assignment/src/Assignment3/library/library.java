package Assignment3.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Library class (HAS-A relationship with Item)
 */
public class library {
    private List<Item> items;

    // Constructor
    public library() {
        items = new ArrayList<>();
    }

    // Method to add item
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to show all items
    public void showAllItems() {
        System.out.println("\nLibrary contains:");
        for (Item item : items) {
            item.displayInfo();
        }
    }
}
