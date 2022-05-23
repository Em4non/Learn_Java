package Experiment_3.多数组排序;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] array1 = new int[a];
        for (int i = 0; i < a; i++) {
            array1[i] = sc.nextInt();
        }
        b = sc.nextInt();
        int[] array2 = new int[b];
        for (int i = 0; i < b; i++) {
            array2[i] = sc.nextInt();
        }
        c = sc.nextInt();
        int[] array3 = new int[c];
        for (int i = 0; i < c; i++) {
            array3[i] = sc.nextInt();
        }
        int sum = a + b + c;
        int[] ans = new int[sum];
        for (int i = 0; i < a; i++) {
            ans[i] = array1[i];
        }
        for (int i = a; i < a + b; i++) {
            ans[i] = array2[i - a];
        }
        for (int i = a + b; i < sum; i++) {
            ans[i] = array3[i - a - b];
        }
        Arrays.sort(ans);
        System.out.print(ans[ans.length - 1]);
        for (int i = ans.length - 2; i >= 0; i--) {
            System.out.print(" " + ans[i]);
        }
    }
}
