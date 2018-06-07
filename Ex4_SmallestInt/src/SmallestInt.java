/*
 * SmallestInt.java
 */

import java.util.Scanner;

/**
 *
 * @author Colin Reasoner
 */


public class SmallestInt {

    /**
     * Outputs a prompt for the user to the terminal.
     */
    private static void promptForInput(){
        System.out.print("How many integers shall we compare? (Enter a positive integer): ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Initialize a Scanner to read input from the command line
        // You may assume that only int values will be supplied as input for this assignment
        Scanner input = new Scanner(System.in);

    	/* Prompt the user and validate their input to ensure they've entered a positive (greater than zero) integer. Discard/ignore any other data.
    	 * Note that we'll be doing this at least once and most likely multiple times...
    	 */

    	// I first did it this way with an initial prompt and input of the first attempt at getting a valid numInt.
        // Then a while loop to keep prompting for a valid value when invalid values are input.
        //
//        promptForInput(); // prompt moved to a method to decrease code duplication
//        int numInt = input.nextInt();
//        while (numInt <= 0) {
//            // Display the following text in the event of an invalid input - only positive integers are valid
//            System.out.println("Invalid input!");
//
//            //System.out.print("How many integers shall we compare? (Enter a positive integer): ");
//            promptForInput();
//            numInt = input.nextInt();
//        }

        // Final implementation: let's do it with a do-while loop instead to eliminate the first input prompt.  Both
        // implementations pass the unit tests, "so I got that goin' for me, which is nice."
        //
        int numInt;
        do {
            promptForInput();
            numInt = input.nextInt();
            if (numInt <= 0) System.out.println("Invalid input!");
        } while (numInt <= 0);

        /* Read in the candidates for smallest integer
         * We know in advance how many times we need to iterate by the time we get here... why not use a for loop?
         */
        // Declare smallest and initialize to largest possible integer value
        int smallest = Integer.MAX_VALUE;
        for(int ii = 1; ii <= numInt; ii++) {    // Fill in the blanks! Seriously, fill them in! As currently written this will loop forever
        	
            // Prompt as follows
            System.out.print("Enter value " + ii + ": ");
            int intIn = input.nextInt();

            if (intIn < smallest) {
                smallest = intIn;
            }

        } // End of loop over input
        
        /* At this point we know the smallest int entered... display it already!
         * Note that I used a local variable named "smallest" to keep track of the smallest int. If you name yours anything else you'll need to update the line below.
         * Note also that I didn't indicate where you should declare smallest... that's up to you/part of the assignment.
         */
        // Don't print any output if 0 numbers were requested.
        System.out.println("The smallest number entered was: " + smallest);
        input.close();
    } // End of main method
    
} // End of class SmallestInt
