/*
 * Square.java - Concrete Square class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Square extends TwoDimensionalShape {
    // A square is a two dimensional shape where dim1 and dim2 are the same length

    private static final String DEFAULT_SQUARE_NAME = "Square";

    // No-argument constructor
    public Square() {
        this(null, 0d);
    }

    // Constructor with just name provided
    public Square(String name) {
        this(name, 0d);
    }

    // Constructor with just length provided - name is defaulted
    public Square(double length) {
        this(DEFAULT_SQUARE_NAME, length);
    }

    // Constructor with name and length provided
    public Square(String name, double length) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, length, length);
    }

    public double getLength() {
        return super.getDim1();
    }

    public void setLength(double length) {
        try {
            super.setDim1(length);
            super.setDim2(length);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Square side length must be >= 0");
        }
    }

    @Override
    public double getArea() {
        return getLength() * getLength();
    }

    @Override
    public String toString() {
        return "length: " + getLength();
    }
}
