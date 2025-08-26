package Assignment5;

/**
 * TicketBooking class with overloaded makePayment methods.
 */
public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {
    }

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded methods for payments

    // Cash Payment
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash%n", amount);
    }

    // Wallet Payment
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s%n", amount, walletNumber);
    }

    // Credit Card Payment
    public void makePayment(String cardHolder, double amount, String creditCardType, String ccv) {
        System.out.printf("Holder name:%s%n", cardHolder);
        System.out.printf("Amount %.1f paid using %s card%n", amount, creditCardType);
        System.out.printf("CCV:%s%n", ccv);
    }

    // Display booking info
    public void displayBooking() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }
}