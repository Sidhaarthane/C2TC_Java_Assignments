package lambdaexpression_assignment;

/**
 * Main Class
 * ----------
 * Demonstrates how to use the TaskScheduler with lambda expressions.
 * Three tasks are scheduled at different intervals.
 */
public class Main {
    public static void main(String[] args) {
        
        // Create TaskScheduler object
        TaskScheduler scheduler = new TaskScheduler();

        // Task 1: Print current time every 2 seconds
        scheduler.scheduleTask(() -> 
            System.out.println("Task 1 -> Current Time: " + java.time.LocalTime.now()), 2);

        // Task 2: Print a motivational message every 3 seconds
        scheduler.scheduleTask(() -> 
            System.out.println("Task 2 -> Reminder: Stay focused!"), 3);

        // Task 3: Print a break reminder every 5 seconds
        scheduler.scheduleTask(() -> 
            System.out.println("Task 3 -> Don't forget to take a break!"), 5);
    }
}