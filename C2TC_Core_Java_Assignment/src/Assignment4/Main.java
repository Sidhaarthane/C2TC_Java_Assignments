package Assignment4;
111

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The assignment specifies to round off to 2 decimal places.
        // We'll use DecimalFormat for this.
        DecimalFormat df = new DecimalFormat("0.00");

        // Read choice, hours, and cost per hour from user input
        // This follows the input format mentioned in the assignment.
        // Choice: 1 for AirIndia, 2 for KingFisher, 3 for Indigo
        // The following lines read the input and store them in variables.
        System.out.println("Enter your choice (1 for AirIndia, 2 for King Fisher, 3 for Indigo): ");
        int choice = scanner.nextInt();
        System.out.println("Enter hours of travel: ");
        int hours = scanner.nextInt();
        System.out.println("Enter cost per hour: ");
        double costPerHour = scanner.nextDouble();

        Airfare airfare;
        double totalAmount = 0.0;

        // Use a switch statement to create the appropriate object based on user choice
        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                totalAmount = airfare.calculateAmount();
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                totalAmount = airfare.calculateAmount();
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                totalAmount = airfare.calculateAmount();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Print the total amount, formatted to two decimal places
        System.out.println(df.format(totalAmount));
        scanner.close();
    }
}