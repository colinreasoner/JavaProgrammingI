/*
 * Employee.java
 */

/**
 *
 * @author Colin Reasoner
 */
public class Employee {

	// Name your member variables as follows: firstName, lastName and monthlySalary
    private String firstName;
    private String lastName;
    private double monthlySalary;

	// Implement a three-parameter constructor that takes, in order: the first name, last name and monthly salary
    public Employee (String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        if (this.monthlySalary < 0) {
            // Set salary to zero if negative value provided.
            // Initializing salary to zero is allowed.
            this.monthlySalary = 0.0;
        }
    }

    // Colin: defining a default constructor for completeness
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.monthlySalary = 0.0;
    }

	// Your accessor methods should be named following the pattern getVariableName. e.g.: getFirstName
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Your mutator methods should be named following the pattern setVariableName. e.g.: setFirstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Set new salary only if input is positive. Negative and zero salary not allowed.
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

} // End of class Employee
