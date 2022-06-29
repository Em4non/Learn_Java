package HomeWork_6.字符串;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String str = sc.nextLine();
        char c = t.charAt(0);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) sum++;
        }
        System.out.println(sum);
        String rs = new StringBuffer(s).reverse().toString();
        System.out.println(rs);
        int point = s.indexOf(str);
        boolean flag = true;
        while (point != -1) {
            if (flag) {
                System.out.print(point);
                flag = false;
            } else System.out.print(" " + point);
            point = s.indexOf(str, point + str.length());
        }
        System.out.println();
        StringBuffer ups = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) ups.append(Character.toUpperCase(s.charAt(i)));
            else if (s.charAt(i - 1) == ' ') ups.append(Character.toUpperCase(s.charAt(i)));
            else ups.append(s.charAt(i));
        }
        System.out.println(ups);
    }
}
