package Experiment_4.Shape类;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square(sc.nextDouble());
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        Circle circle = new Circle(sc.nextDouble());
        System.out.printf("%.2f %.2f", sq.getPerimeter(), sq.getArea());
        System.out.println();
        System.out.printf("%.2f %.2f", rectangle.getPerimeter(), rectangle.getArea());
        System.out.println();
        System.out.printf("%.2f %.2f", circle.getPerimeter(), circle.getArea());
    }
}
