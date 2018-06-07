/*
 * Shape.java - Abstract Shape class
 */

/**
 *
 * @author Colin Reasoner
 */
public abstract class Shape {
    private String name;

    // No-argument constructor
    public Shape() {
        this.name = null;
    }

    // Constructor with name provided
    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s", getName());
    }
}
