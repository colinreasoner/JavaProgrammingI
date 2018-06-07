/*
 * Cube.java - Concrete Cube class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Cube extends ThreeDimensionalShape {
    // A Cube is a three dimensional shape with all sides having the same length

    private static final String DEFAULT_CUBE_NAME = "Cube";

    // No-argument constructor
    public Cube() {
        this(null, 0d);
    }

    // Constructor with just name provided
    public Cube(String name) {
        this(name, 0d);
    }

    // Constructor with only length provided - name is defaulted
    public Cube(double length) {
        this(DEFAULT_CUBE_NAME, length);
    }

    // Constructor with name and length provided
    public Cube(String name, double length) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, length, length, length);
    }

    public double getLength() {
        return super.getDim1();
    }

    public void setLength(double length) {
        try {
            super.setDim1(length);
            super.setDim2(length);
            super.setDim3(length);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Cube side length must be >= 0");
        }
    }

    @Override
    public double getArea() {
        return 6d * Math.pow(getLength(), 2d);
    }

    @Override
    public double getVolume() {
        return Math.pow(getLength(), 3d);
    }

    @Override
    public String toString() {
        return "side length: " + getLength();
    }
}
