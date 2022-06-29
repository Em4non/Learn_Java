package HomeWork_6.数据类型判断;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String s[] = str1.split(" ");
        for (int i = 0; i < s.length; i++) {
            boolean flag = true;
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(i) < '0' || s[i].charAt(i) > '9') {
                    flag = false;
                    break;
                }
            }
            if (s[i].equals("false") || s[i].equals("true")) {
                if (i == 0) System.out.print("boolean");
                else System.out.print(" boolean");
            } else if (new StringBuffer(s[i]).indexOf(".") != -1) {
                if (i == 0) System.out.print("double");
                else System.out.print(" double");
            } else if (flag) {
                if (i == 0) System.out.print("int");
                else System.out.print(" int");
            } else {
                if (i == 0) System.out.print("String");
                else System.out.print(" String");
            }
        }
    }
}
