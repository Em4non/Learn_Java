package Experiment_4.Shape类;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.1415926 * radius;
    }

    @Override
    public double getArea() {
        return 3.1415926 * radius * radius;
    }
}

