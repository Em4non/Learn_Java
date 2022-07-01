package HomeWork_8.设计一个Tiangle异常类;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        try {
            Triangle t = new Triangle(s1,s2,s3);
            System.out.println(t);
        }catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
class IllegalTriangleException extends Exception{
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1,double side2 ,double side3) {
        super("Invalid: "+side1+","+side2+","+side3);//message是父类成员变量，使用super向上传参!
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
}
class Triangle{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1,double side2,double side3)
            throws IllegalTriangleException{
        if((side1+side2)>side3&(side1+side3)>side2&(side2+side3)>side1)
        {this.side1=side1;this.side2=side2;this.side3=side3;}
        else
            throw new  IllegalTriangleException(side1,side2,side3);
    }
    @Override
    public String toString(){
        return "Triangle ["+"side1="+this.side1+", side2="+this.side2+", side3="+this.side3+"]";
    }
}
