/*
 * IntegerSet.java
 */

/**
 *
 * @author Colin Reasoner
 */

public class IntegerSet {
    private boolean[] integers;
    private static final int INTEGERSET_LENGTH = 101;

    /** 
     * Creates a new instance of IntegerSet   
     */
    public IntegerSet(){
        integers = new boolean[INTEGERSET_LENGTH];
    }
    
    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     * @param setA an IntegerSet object
     * @param setB an IntegerSet object
     * @return a new IntegerSet object that is the union of setA and setB
     */
    public static IntegerSet union(IntegerSet setA, IntegerSet setB) {
        IntegerSet unionSet = new IntegerSet();

        for (int i = 0; i < unionSet.integers.length; i++) {
            if (setA.integers[i] || setB.integers[i]) {
                unionSet.integers[i] = true;
            }
        }
        return unionSet;
    }

    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     * @param setA an IntegerSet object
     * @param setB an IntegerSet object
     * @return a new IntegerSet object that is the intersection of setA and setB
     */
    public static IntegerSet intersection(IntegerSet setA, IntegerSet setB) {
        IntegerSet intersectSet = new IntegerSet();

        for (int i = 0; i < intersectSet.integers.length; i++) {
            if (setA.integers[i] && setB.integers[i]) {
                intersectSet.integers[i] = true;
            }
        }
        return intersectSet;
    }

    /**
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     * @param value the value to add to the set
     * @return true if value is in range, false if value out of range
     */
    public boolean insertElement(int value) {
        if (value >= 0 && value < integers.length) {
            integers[value] = true;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     * @param value the value to remove from the set
     * @return true if value is in range, false if value out of range
     */
    public boolean deleteElement(int value) {
        if (value >= 0 && value < integers.length) {
            integers[value] = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    public String toString() {
        // IntelliJ recommended using StringBuilder to do multiple appending operations (as is done in the for loop)
        // instead of using str += appends.  Stackoverflow agrees.
        StringBuilder str = new StringBuilder();
        str.append("{ ");

        for (int i = 0; i < integers.length; i++) {
            if (integers[i]) {
                // IntelliJ recommended against using string concatenation with + in a str.append() call, but
                // is doing it with str.append(i).append(" ") really better?
                //str.append(i + " ");
                str.append(i).append(" ");
            }
        }

        if (str.toString().equals("{ ")) {
            str.append("--- ");
        }

        str.append("}");
        return str.toString();
    }

    /**
     * Returns true iff the current IntegerSet contains the same integers as
     * the IntegerSet supplied as an argument
     * @param setA set to compare for equality
     * @return true if setA is equal, false if not
     */
    public boolean isEqualTo(IntegerSet setA) {
        for (int i = 0; i < this.integers.length; i++ ) {
            if (this.integers[i] != setA.integers[i]) {
                return false;
            }
        }

        return true;
    }
}
