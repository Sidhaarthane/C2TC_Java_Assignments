package Assignment5;

import java.util.Scanner;

/**
 * Main driver class for Assignment 5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details in CSV format
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String stageEvent = parts[0];
        String customer = parts[1];
        int noOfSeats = Integer.parseInt(parts[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.displayBooking();

        switch (choice) {
            case 1: // Cash
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: // Wallet
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3: // Credit card
                String cardHolder = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(cardHolder, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}