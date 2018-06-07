public class EmployeeTest {
    public static void main(String args[]) {
        String expectedFirst = "John";
        String expectedLast = "Doe";
        String expectedSSN = "111-22-3333";
        double expectedSales = 444.55;
        double expectedRate = 0.1;
        double expectedSalary = 200;
        BasePlusCommissionEmployeeComposition emp =
                new BasePlusCommissionEmployeeComposition(expectedFirst, expectedLast,
                        expectedSSN, expectedSales, expectedRate, expectedSalary);

        System.out.printf("%s%n%n", emp.toString());
        System.out.printf("total earnings: %.2f%n%n", emp.earnings());

        try {
            emp.setBaseSalary(-1000d);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Giving a raise and increasing sales");
        emp.setGrossSales(emp.getGrossSales()+100d);
        emp.setBaseSalary(1000d);
        System.out.printf("%s%n%n", emp);
        System.out.printf("total earnings: %.2f%n", emp.earnings());
    }
}
