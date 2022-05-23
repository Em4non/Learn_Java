package HomeWork_3.解析二维数组;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int column = 0, row = 0;
        System.out.print("d[0,0] = " + s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ',') {
                row++;
                i++;
                System.out.print(" " + "d[" + column + "," + row + "]" + " = " + s.charAt(i));
            } else if (c == ';') {
                row = 0;
                column++;
                i++;
                System.out.println();
                System.out.print("d[" + column + "," + row + "]" + " = " + s.charAt(i));
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                System.out.print(s.charAt(i));

            }


        }
    }
}
