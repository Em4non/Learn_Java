package Experiment_3.数组元素的删除;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int t = 0;
        for (int i = 0; i < k; i++) {
            t = sc.nextInt();
            for (int j = t - 1; j < Array.length; j++) {
                if (j + 1 != Array.length) Array[j] = Array[j + 1];
            }
            Array[Array.length - i - 1] = 0;
        }
        System.out.print(Array[0]);
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] != 0) System.out.print(" " + Array[i]);
        }
    }
}
