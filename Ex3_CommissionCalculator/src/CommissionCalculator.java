/*
 * CommissionCalculator.java
 */

import java.util.Scanner;

/**
 *
 * @author Colin Reasoner
 */

public class CommissionCalculator {

    /* Note that we'll be doing this at least once and most likely multiple times...
     * Prompt the user with a menu of the four items and their values (this information is included in the problem statement)
     */
    private static void promptWithCompensation(double compensation) {
        System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89");
        System.out.printf("Current compensation: $%.2f%n", compensation);
        System.out.print("Please select an item from the list above (or enter 0 to exit): ");
    }

    public static void main(String args[]) {
        // Initialize a Scanner to read input from the command line
    	Scanner input = new Scanner(System.in);
		double compensation = 200.00;
		double commission = 0.09;

        /* Display the user's current compensation
         *
         * Prompt and take input from the user (you may assume that they will only enter int values)
         * They'll enter an item number (1 - 4) to record its sale or 0 to exit
         *
         * NOTE: THE USER DOES NOT ENTER PRICES DIRECTLY... THEY ENTER ITEM NUMBERS TO INDICATE WHAT WAS SOLD
         * NOTE: THE USER MAY ENTER THE SAME ITEM NUMBRER MULTIPLE TIMES
         *
         * If the user provides invalid input (a value other than 0 - 4) display "ERROR: Invalid input!" and prompt them again
         */

        /* After the user enters 0, display the salesperson's earnings in the format "Total earnings: $NNN.NN" and exit
         * For example, if the salesperson sold two item 3s this week the final output would be "Total earnings: $217.99"
         */

        // Initial prompt and response
        promptWithCompensation(compensation);
        int response = input.nextInt();

        while (response != 0) {

            // Use an if, else if, else - passed all unit tests
            if (response == 1) {
                compensation += 239.99 * commission;
            }
            else if (response == 2) {
                compensation += 129.75 * commission;
            }
            else if (response == 3) {
                compensation += 99.95 * commission;
            }
            else if (response == 4) {
                compensation += 350.89 * commission;
            }
            else {
                System.out.println("ERROR: Invalid input!");
            }

            // Jumping ahead a bit and trying a switch statement - passed all unit tests
//            switch(response) {
//                case 1:
//                    compensation += 239.99 * commission;
//                    break;
//                case 2:
//                    compensation += 129.75 * commission;
//                    break;
//                case 3:
//                    compensation += 99.95 * commission;
//                    break;
//                case 4:
//                    compensation+= 350.89 * commission;
//                    break;
//                default:
//                    System.out.println("ERROR: Invalid input!");
//                    break;
//            }

            // Show the items for sale, show the current compensation (which has been updated with valid
            // input), and prompt for the next input.
            promptWithCompensation(compensation);
            response = input.nextInt();
        } // end of while (response != 0){}

        // Print total earnings
        System.out.printf("Total earnings: $%.2f", compensation);

    } // End of main()
    
} // end of CommissionCalculator class
