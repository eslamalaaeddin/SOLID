package O;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = initShapes();

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + " is: " + shape.getArea());
        }

    }

    static List<Shape> initShapes() {
        Shape triangle1 = new Triangle(3, 4);
        Shape triangle2 = new Triangle(2, 4);
        Shape triangle3 = new Triangle(3, 6);

        Shape square1 = new Square(6);
        Shape square2 = new Square(7);
        Shape square3 = new Square(8);
        Shape square4 = new Square(9);

        Shape circle1 = new Circle(10);
        Shape circle2 = new Circle(11);
        Shape circle3 = new Circle(12);
        Shape circle4 = new Circle(13);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(triangle3);

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(square4);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(circle4);

        return shapes;
    }

}
