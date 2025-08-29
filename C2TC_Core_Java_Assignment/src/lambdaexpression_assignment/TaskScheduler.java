package lambdaexpression_assignment;

class TaskScheduler {
    public void scheduleTask(Task task, int intervalInSeconds) {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    task.execute();   // Run the task
                    Thread.sleep(intervalInSeconds * 1000); // Wait for interval
                }
            } catch (InterruptedException e) {
                System.out.println("Task interrupted: " + e.getMessage());
            }
        });
        thread.start();
    }
}
