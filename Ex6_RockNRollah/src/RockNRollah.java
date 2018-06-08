/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 *
 * @author Colin Reasoner
 */
public class RockNRollah {
       
    public static void main(String[] args) {
    	// Create a Random object
    	// Initialize a couple of variables to hold the values of the two dice
    	// Initialize the array that will hold the results
    	/* Hypothetical questions: (no, I don't want answers)
    	 *   How many different sum values do we need to account for?
    	 *   How big does the array need to be?
    	 *   Why might you make it (slightly) larger? (Note: my answer does not use an unnecessarily large array, and I'm not encouraging you to; just giving you something to think about) 
    	 */
    	// Roll the dice (a lot) and sum and tally the results
        // Display the frequencies

        int rolls;
        int dice1;
        int dice2;
        Random diceRoll = new Random();

        // Declare array to store counts of the dice rolls
        // Array elements are automatically initialized to zero
        // Request a 13 element array so we can use indices 2-12 for counting the sum of two six-sided dice.
        // We'll be ignoring elements 0 and 1 of the array.
        int[] counts = new int[13];

        // Roll the dice
        for (rolls = 0 ; rolls < 36_000_000; rolls++) {
            dice1 = diceRoll.nextInt(6) + 1;
            dice2 = diceRoll.nextInt(6) + 1;
            // Increment the counts[] element that corresponds to the sum of the dice.
            counts[dice1 + dice2]++;
        }

        System.out.println("Results after " + rolls + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");

        // Loop, displaying the rows for the body of the table, each on its own line.
        //   The required format for each row is to display the sum, followed by a tab, followed by the number of times that sum came up. Do not include any additional formatting

        // For output, loop from 2 to 12 since that's the set of all possible sums of two six-sided dice
        for (int i = 2 ; i < counts.length ; i++) {
            System.out.printf("%d\t%d%n", i, counts[i]);
        }
    } // end of main
    
} // end of class RockNRollah
