/*
 * ShapeTest.java
 */

/**
 *
 * @author Godfrey
 */
public class ShapeTest {
    
    public static void main(String[] args) {
        Shape shapes[] = new Shape[6];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(10);
        shapes[2] = new Triangle(3, 5);
        shapes[3] = new Sphere(2);
        shapes[4] = new Cube(8);
        /**
         * I'm not terribly hip on tetrahedra... if this ratio isn't legit, 
         * don't come complaining (but you're welcome to tell me about it)
         */        
        shapes[5] = new Tetrahedron(3, 5, 9);
        
        for(Shape s : shapes) {
            System.out.print(s.getName() + ": " + s + "\n");
            System.out.print(s.getName() + "'s ");
            if(s instanceof TwoDimensionalShape)
                System.out.printf("area is: %f\n",
                        ((TwoDimensionalShape)s).getArea());
            else if(s instanceof ThreeDimensionalShape)
                System.out.printf("area is: %f, and volume is: %f\n",
                        ((ThreeDimensionalShape)s).getArea(),
                        ((ThreeDimensionalShape)s).getVolume());
            System.out.println();
        }

        // Quiz 9 Question 7 test
        System.out.println("Testing some object names retrieval examples for Quiz 9 Question 7");
        System.out.println("Creating a Cube object, obj, named 'My Cube'");
        Cube obj = new Cube("My Cube", 6.0);
        // Compiler error System.out.println(obj.name);
        // Compiler error System.out.println(obj.class.name);
        System.out.println("obj.getName() result: " + obj.getName());
        System.out.println("obj.getClass().getName() result: " + obj.getClass().getName());
        // Compiler error System.out.println(obj.getClass.getName);
    }
    
}
