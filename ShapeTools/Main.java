package ShapeTools;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractShape> abstractShapes = new ArrayList<>();
        abstractShapes.add(new Circle(3.0));
        abstractShapes.add(new Square(4.0));
        abstractShapes.add(new Rectangle(3.0, 5.0));

        for(AbstractShape abstractShape : abstractShapes) {
            System.out.println("넓이: " + abstractShape.getArea());
            System.out.println("둘레: " + abstractShape.getPerimeter());
            abstractShape.move(3.0, 5.0);
            System.out.println("x: " + abstractShape.getX() + ", y: " + abstractShape.getY());
            abstractShape.move(-2.0, 3.0);
            System.out.println("x: " + abstractShape.getX() + ", y: " + abstractShape.getY());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Printable> shapes = new ArrayList<>();

        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(4, 2));
        shapes.add(new Square(3));
        shapes.add(new Square(1));

        for (Printable shape : shapes) {
            shape.print();
            System.out.println("---------");
        }
    }
}
