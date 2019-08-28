package ShapeTools;

public abstract class AbstractShape {
    // Variables
    private double x, y;

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
