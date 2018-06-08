/*
 * ThreeDimensionalShape.java - Abstract ThreeDimensionalShape class
 */

/**
 *
 * @author Colin Reasoner
 */

public abstract class ThreeDimensionalShape extends Shape {
    private double dim1;
    private double dim2;
    private double dim3;

    // No-argument constructor
    public ThreeDimensionalShape() {
        this(null, 0d, 0d, 0d);
    }

    // Constructor with name only
    public ThreeDimensionalShape(String name) {
        this(name, 0d, 0d, 0d);
    }

    // Constructor with name and all three dimensions provided
    public ThreeDimensionalShape(String name, double dim1, double dim2, double dim3) {
        super(name);
        if (dim1 < 0d || dim2 < 0d || dim3 < 0d) {
            throw new IllegalArgumentException("dim1, dim2, and dim3 must be >= 0");
        }

        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
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

    public double getDim3() {
        return dim3;
    }

    public void setDim3(double dim3) {
        if (dim3 < 0d) {
            throw new IllegalArgumentException("dim3 must be >= 0");
        }
        this.dim3 = dim3;
    }

    public abstract double getArea();
    public abstract double getVolume();

    @Override
    public String toString() {
        return String.format("%s base width: %.2f base height: %.2f height: %.2f",
                super.toString(), getDim1(), getDim2(), getDim3());
    }

}
