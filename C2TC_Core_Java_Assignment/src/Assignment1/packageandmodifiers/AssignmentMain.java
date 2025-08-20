package Assignment1.packageandmodifiers;

import Assignment1.packageandmodifiers.employees.Developer;
import Assignment1.packageandmodifiers.employees.Manager;
import Assignment1.packageandmodifiers.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager("Alice", "M101", 80000, "Sales");

        // Create Developer object
        Developer dev = new Developer("Bob", "D202", 60000, "Java");

        // Use EmployeeUtilities
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Increase salary
        EmployeeUtilities.increaseSalary(mgr, 10);
        EmployeeUtilities.increaseSalary(dev, 15);

        // Print details again
        System.out.println("\n--- After Salary Increment ---");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);
    }
}