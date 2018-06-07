/*
 * Triangle.java - Concrete Triangle class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Triangle extends TwoDimensionalShape {
    // A triangle has a base width and a height

    private static final String DEFAULT_TRIANGLE_NAME = "Triangle";

    // No-argument constructor
    public Triangle() {
        this(null, 0d, 0d);
    }

    // Constructor with just name provided
    public Triangle(String name) {
        this(name, 0d, 0d);
    }

    // Constructor with width and height provided - name is defaulted
    public Triangle(double baseWidth, double height) {
        this(DEFAULT_TRIANGLE_NAME, baseWidth, height);
    }

    // Constructor with name, width, height provided
    public Triangle(String name, double baseWidth, double height) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, baseWidth, height);
    }

    public void setBaseWidth(double baseWidth) {
        try {
            super.setDim1(baseWidth);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Triangle baseWidth must be >= 0");
        }
    }

    public double getBaseWidth() {
        return super.getDim1();
    }

    public void setHeight(double height) {
        try {
            super.setDim2(height);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Triangle height must be >= 0");
        }
    }

    public double getHeight() {
        return super.getDim2();
    }

    @Override
    public double getArea() {
        return 0.5 * getBaseWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "base width: " + getBaseWidth() + ", height: " + getHeight();
    }
}
