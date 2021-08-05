package O;

public class Square implements Shape{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

    @Override
    public String toString() {
        return "Square";
    }
}
