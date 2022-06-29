package HomeWork_6.各类字符数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        int x = 0;
        int d = 0;
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 'a' && c <= 'z') x++;
            else if (c >= 'A' && c <= 'Z') d++;
            else f++;
        }
        System.out.println(d);
        System.out.println(x);
        System.out.println(f);
    }
}
