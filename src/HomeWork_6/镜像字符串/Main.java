package HomeWork_6.镜像字符串;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (new StringBuffer(a).reverse().toString().equals(b)) System.out.println("yes");
        else System.out.println("no");
    }
}
