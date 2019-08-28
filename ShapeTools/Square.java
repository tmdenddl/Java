package ShapeTools;

public class Square extends AbstractShape implements Printable{
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
