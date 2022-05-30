package HomeWork_4.重写父类方法equals;

import java.util.Scanner;

class Point {
    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return point.xPos == xPos && point.yPos == yPos;
        }
        return true;
    }
}

public class Main extends Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object p1 = new Point(sc.nextInt(), sc.nextInt());
        Object p2 = new Point(sc.nextInt(), sc.nextInt());
        System.out.println(p1.equals(p2));
        sc.close();
    }
}
