/*
 * Sphere.java - Concrete Sphere class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Sphere extends ThreeDimensionalShape {
    // A sphere is a three dimensional shape with dim1, dim2, dim3 all equal to the radius

    private static final String DEFAULT_SPHERE_NAME = "Shpere";

    // No-argument constructor
    public Sphere() {
        this(null, 0d);
    }

    // Constructor with just name provided
    public Sphere(String name) {
        this(name, 0d);
    }

    // Constructor with only radius provided - name is defaulted
    public Sphere(double radius) {
        this(DEFAULT_SPHERE_NAME, radius);
    }

    // Constructor with name and radius provided
    public Sphere (String name, double radius) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, radius, radius, radius);
    }

    public double getRadius() {
        return super.getDim1();
    }

    public void setRadius(double radius) {
        try {
            super.setDim1(radius);
            super.setDim2(radius);
            super.setDim3(radius);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Sphere radius must be >= 0");
        }
    }

    @Override
    public double getArea() {
        return 4d * Math.PI * Math.pow(getRadius(), 2d);
    }

    @Override
    public double getVolume() {
        return 4d/3 * Math.PI * Math.pow(getRadius(), 3d);
    }

    @Override
    public String toString() {
        return "radius: " + getRadius();
    }
}
