package Experiment_4.Shape类;

public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
