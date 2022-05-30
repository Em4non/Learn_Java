package HomeWork_4.手机类;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CellPhone c1 = new CellPhone(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        CellPhone c2 = new CellPhone(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);
    }
}

/* 你的代码将被嵌在这里 */
