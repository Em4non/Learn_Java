package Experiment_3.重复数据问题;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s+", "");
        int i, j;
        boolean flag = false;
        char[] a = str.toCharArray();
        Arrays.sort(a);
        for (i = 0; i < a.length; i++)
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
        if (flag) System.out.println("yes");
        else System.out.println("no");
    }
}
