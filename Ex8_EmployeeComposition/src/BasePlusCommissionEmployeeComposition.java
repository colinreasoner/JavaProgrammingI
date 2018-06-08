/*
 * BasePlusCommissionEmployeeComposition.java
 */

/**
 *
 * @author Colin Reasoner
 */
public class BasePlusCommissionEmployeeComposition {
    
    private double baseSalary; // base salary per week
    // Demonstrate composition of (as opposed to inheritance from) a CommissionEmployee object
    private CommissionEmployee emp;

    // six-argument constructor
    public BasePlusCommissionEmployeeComposition( String first, String last, 
            String ssn, double sales, double rate, double salary) {
        this.emp = new CommissionEmployee(first, last, ssn, sales, rate);

        if (salary < 0d) {
            throw new IllegalArgumentException("Base salary must be positive");
        }

        this.baseSalary = salary;
    }
    
    // Implement accessors and mutators for all six attributes (stubs appear below)
    // As per the text (demonstrated in its BasePlusCommissionEmployee implementation), throw an IllegalArgumentException if the salary argument is negative
    public void setBaseSalary( double salary ) {
        if (salary < 0d) {
            throw new IllegalArgumentException("Base salary must be positive");
        }

        this.baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getFirstName() {
        return emp.getFirstName();
    }

    public String getLastName() {
        return emp.getLastName();
    }

    public String getSocialSecurityNumber() {
        return emp.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return emp.getGrossSales();
    }

    public void setGrossSales(double sales) {
        emp.setGrossSales(sales);
    }

    public double getCommissionRate() {
        return emp.getCommissionRate();
    }

    public void setCommissionRate(double rate) {
        emp.setCommissionRate(rate);
    }    
    
    public double earnings() {
        return emp.earnings() + baseSalary;
    }
    
    @Override
    public String toString() {        
        return String.format(
                "base-salaried %s%nbase salary: %.2f",
                emp.toString(), this.getBaseSalary()
        );
    }
}
