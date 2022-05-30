package Experiment_4.打印杨辉三角_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] triangle = new int[n][];
        for (int i = 0; i < triangle.length; i++) {
            for (int k = 0; k < n * 2 - (i + 1) * 2; k++) {
                System.out.print(" ");
            }
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                if (i == 0 || j == 0 || i == j) {
                    triangle[i][j] = 1;
                } else triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];

                System.out.printf("%-4d", triangle[i][j]);

            }
            System.out.println();
        }
    }
}
