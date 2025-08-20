
package Assignment1.packageandmodifiers.employees;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    /**
     * Constructor to initialize employee details.
     */
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {   // protected: can be accessed in subclasses
        this.salary = salary;
    }

    /**
     * Returns basic details of employee.
     */
    public String getDetails() {
        return "ID: " + employeeId + ", Name: " + name + ", Salary: " + salary;
    }
}