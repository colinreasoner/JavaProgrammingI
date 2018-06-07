/*
 * Tetrahedron.java - Concrete Tetrahedron class
 */

/**
 *
 * @author Colin Reasoner
 */

public class Tetrahedron extends ThreeDimensionalShape {

    // A tetrahedron has a triangular base with a baseWidth and a baseHeight and triangular sides. The three-dimensional
    // shape has a height for the third dimension
    private static final String DEFAULT_TETRAHEDRON_NAME = "Tetrahedron";

    // No-argument constructor
    public Tetrahedron() {
        this(null, 0d, 0d, 0d);
    }

    // Constructor with just name provided
    public Tetrahedron (String name) {
        this(name, 0d, 0d, 0d);
    }

    // Constructor with all three dimensions provided - name is defaulted
    public Tetrahedron(double baseWidth, double baseHeight, double height) {
        this(DEFAULT_TETRAHEDRON_NAME, baseWidth, baseHeight, height);
    }

    // Constructor with name and all three dimensions provided
    public Tetrahedron(String name, double baseWidth, double baseHeight, double height) {
        // The parent class constructor does range checking on the shape dimensions
        super(name, baseWidth, baseHeight, height);
    }

    public double getBaseWidth() {
        return super.getDim1();
    }

    public void setBaseWidth(double baseWidth) {
        try {
            super.setDim1(baseWidth);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tetrahedron baseWidth must be >= 0");
        }
    }

    public double getBaseHeight() {
        return super.getDim2();
    }

    public void setBaseHeight(double baseHeight) {
        try {
            super.setDim2(baseHeight);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tetrahedron baseHeight must be >= 0");
        }
    }

    public double getHeight() {
        return super.getDim3();
    }

    public void setHeight(double height) {
        try {
            super.setDim3(height);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tetrahedron height must be >= 0");
        }
    }

    @Override
    public double getArea() {
        return 4d * ((getBaseWidth() * getBaseHeight()) / 2d);
    }

    @Override
    public double getVolume() {
        return 1d/3 * ((getBaseWidth() * getBaseHeight()) / 2d) * getHeight();
    }

    @Override
    public String toString() {
        return "base width: " + getBaseWidth() + ", base height: " + getBaseHeight() +
                ", height: " + getHeight();
    }
}
