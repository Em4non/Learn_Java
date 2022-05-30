package HomeWork_3.二维方阵变变变;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] Map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Map[j][i] = sc.nextInt();
            }
        }
        switch (d) {
            case 90:
                for (int i = 0; i < n; i++) {
                    for (int j = n - 1; j >= 0; j--) {
                        if (j == n - 1) System.out.print(Map[i][j]);
                        else System.out.print(" " + Map[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int i = n - 1; i >= 0; i--) {
                    for (int j = n - 1; j >= 0; j--) {
                        if (j == n - 1) System.out.print(Map[j][i]);
                        else System.out.print(" " + Map[j][i]);
                    }
                    System.out.println();
                }
                break;
            case -90:
                for (int i = n - 1; i >= 0; i--) {
                    for (int j = 0; j < n; j++) {
                        if (j == 0) System.out.print(Map[i][j]);
                        else System.out.print(" " + Map[i][j]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
