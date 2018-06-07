/*
 * EmployeeTest.java
 */

/**
 *
 * @author Colin Reasoner
 */
public class EmployeeTest {

    // Method to show the Employee's yearly salary. Since we have to do this multiple times during execution of the
    // code, we put it into a method to cut down on code duplication.
    private static void printYearlySalary(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + "\'s yearly salary: " + employee.getMonthlySalary()*12.0);
    }

    public static void main(String args[]){
        // Create two Employee objects
    	//	 Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
    	//   Employee #2: Paul Volcker has a monthly salary of 2345.67
        Employee benBernanke = new Employee("Benjamin", "Bernanke", 1234.56);
        Employee paulVolcker = new Employee("Paul", "Volcker", 2345.67);

        // Display the employees' info (including yearly salary)
    	/* Note that you'll receive slightly different results for the salary displaying via printf and print/println.
    	 * This is due to the implicit precision and the rounding that is applied.
    	 * I used println, but you're welcome to use printf if you like: I account for slight variations in the numeric values displayed for the salaries.
    	 */
        printYearlySalary(benBernanke);
        printYearlySalary(paulVolcker);

        System.out.println("Giving raises...");
        // Give each employee a 10% raises.
    	// Be sure to actually apply the raise to the Employee objects: don't just calculate and display a 10% greater salary within this test code 
        benBernanke.setMonthlySalary(benBernanke.getMonthlySalary()*1.1);
        paulVolcker.setMonthlySalary(paulVolcker.getMonthlySalary()*1.1);

        // Display the employees' info (including yearly salary)
        printYearlySalary(benBernanke);
        printYearlySalary(paulVolcker);

        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        benBernanke.setMonthlySalary(-1234.56);

        // Display Bernanke's info (including yearly salary)
        printYearlySalary(benBernanke);
    }

}
