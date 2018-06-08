/*
 * TwoDimensionalShape.java - Abstract TwoDimensionalShape class
 */

/**
 *
 * @author Colin Reasoner
 */

public abstract class TwoDimensionalShape extends Shape {
    private double dim1;
    private double dim2;

    // No-argument constructor
    public TwoDimensionalShape() {
        this(null, 0d, 0d);
    }

    // Constructor with only name being provided
    public TwoDimensionalShape(String name) {
        this(name, 0d, 0d);
    }

    // Constructor with name and both dimensions provided
    public TwoDimensionalShape(String name, double dim1, double dim2) {
        super(name);
        if (dim1 < 0d || dim2 < 0d) {
            throw new IllegalArgumentException("dim1 and dim2 must be >= 0");
        }
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        if (dim1 < 0d) {
            throw new IllegalArgumentException("dim1 must be >= 0");
        }
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        if (dim2 < 0d) {
            throw new IllegalArgumentException("dim2 must be >= 0");
        }
        this.dim2 = dim2;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("%s width: %.2f height: %.2f",
                super.toString(), getDim1(), getDim2());
    }
}
