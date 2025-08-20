package Assignment3.Items;

/**
 * Subclass Magazine - IS-A Item
 */
public class Magazine extends Item {
    private int issueNumber;

    // Constructor
    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}