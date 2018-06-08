/*
 * Circle.java - Concrete Circle class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Circle extends TwoDimensionalShape {
    // A Circle is a two dimensional shape where both dim1 and dim2 are equal to the radius

    private static final String DEFAULT_CIRCLE_NAME = "Circle";

    // No-argument constructor
    public Circle() {
        this(null, 0d);
    }

    // Constructor with just name provided
    public Circle(String name) {
        this(name, 0d);
    }

    // Constructor with only radius provided - name is defaulted
    public Circle(double radius) {
        this(DEFAULT_CIRCLE_NAME, radius);
    }

    // Constructor with name and radius provided
    public Circle(String name, double radius) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, radius, radius);
    }

    public double getRadius() {
        return super.getDim1();
    }

    public void setRadius(double radius) {
        try {
            super.setDim1(radius);
            super.setDim2(radius);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Circle radius must be >= 0");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "radius: " + getRadius();
    }
}
