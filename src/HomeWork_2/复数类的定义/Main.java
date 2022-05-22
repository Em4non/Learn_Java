package HomeWork_2.复数类的定义;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex();
        Complex b = new Complex();
        Scanner in = new Scanner(System.in);
        a.setRealPart(in.nextDouble());
        a.setImaginaryPart(in.nextDouble());
        b.setRealPart(in.nextDouble());
        b.setImaginaryPart(in.nextDouble());
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.add(b));
        System.out.println(a.sub(b));
    }
}