/*
 * FindPrimes.java
 */

/**
 *
 * @author Colin Reasoner
 */
public class FindPrimes {
       
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");
        /* Loop 10000 times, checking every number along the way for primeness...
         * Let the isPrime method do the heavy lifting
         * If a given number is prime it should be displayed on its own line (non prime numbers are not displayed at all)
         */

        // I'm starting the loop from 0 to make sure 0 and 1 are properly handled by isPrime()
        for (int num = 0; num < 10_000; num++) {
            if (isPrime(num)) System.out.println(num);
        }
    }
    
    public static boolean isPrime(int num) {
    	/* There is more than one way to determine if a number is prime or not...
    	 * We'll take the "easy way out" and verify by brute force that a number is evenly divisible only by 1 and itself:
         * this method will return true if so (it is prime!) and false otherwise (it is not prime)
         * You are NOT being asked to implement the Sieve of Eratosthenes algorithm
         * You MUST use an iterative/loop (no big if-else or switch statements)
         *
         * Note: negative numbers aren't prime. isPrime should return false if provided a negative number as its argument
         */         
        
        /* Part C has you writing and running the program with upper limits of n/2 and the square root of n.
         * Only very minimal (as little as a single line) changes are necessary to use one upper limit in place of another.
         * SUBMIT YOUR SOLUTION USING THE SQUARE ROOT OF N AS THE UPPER LIMIT. 
         * 
         * This exercise shows that you can solve the same problem with 
         * different algorithms... the key takeaway is that, just because one 
         * approach works doesn't mean it is the best.
         *
         * Why are we able to limit our search for even divisors to those numbers less than or equal to the square root?
         * All of the numbers > the square root must be 
         * multiplied by a number < the square root to equal the target 
         * number... so why not just check the numbers <= the square root?
         */

        // Return false right off the bat if the number is negative
        // Also, by definition, 1 and 0 are not prime.
        // The input is an integer, and per the above, any integer <= 1 is not prime.
        if (num <= 1) return false;

        // Just for fun, I also tried the implementation that loops to num/2.  Passes all unit tests.
        /* for (int factor = 2 ; factor <= num/2 ; factor++) { */

        // Required implementation that loops only to Math.sqrt(num). More efficient.
        for (int divisor = 2 ; divisor <= Math.sqrt(num) ; divisor++) {

            // Immediately return false if an even divisor is found for the number. There is no need to keep
            // testing other numbers, so we "short circuit" out of the method.
            if (num % divisor == 0) return false;
        }

        // If we got here, no even divisor was found, so the number is prime.
        return true;
    }
    
}
