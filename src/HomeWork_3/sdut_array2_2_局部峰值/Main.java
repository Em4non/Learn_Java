package HomeWork_3.sdut_array2_2_局部峰值;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] Map = new int[150][150];
        Scanner sc = new Scanner(System.in);
        boolean flag, flagg;
        int n;
        while ((n = sc.nextInt()) != -1) {
            flagg = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Map[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    flag = true;
                    //上
                    if (i - 1 >= 0) if (Map[i][j] <= Map[i - 1][j]) flag = false;
                    //下
                    if (i + 1 < n) if (Map[i][j] <= Map[i + 1][j]) flag = false;
                    //左
                    if (j - 1 >= 0) if (Map[i][j] <= Map[i][j - 1]) flag = false;
                    //右
                    if (j + 1 < n) if (Map[i][j] <= Map[i][j + 1]) flag = false;
                    //左上
                    if (j - 1 >= 0 && i - 1 >= 0) if (Map[i][j] <= Map[i - 1][j - 1]) flag = false;
                    //左下
                    if (j - 1 >= 0 && i + 1 < n) if (Map[i][j] <= Map[i + 1][j - 1]) flag = false;
                    //右上
                    if (j + 1 < n && i - 1 >= 0) if (Map[i][j] <= Map[i - 1][j + 1]) flag = false;
                    //右下
                    if (j + 1 < n && i + 1 < n) if (Map[i][j] <= Map[i + 1][j + 1]) flag = false;
                    if (flag) {
                        System.out.print(Map[i][j] + " ");
                        flagg = true;
                    }
                }
            }
            if (!flagg) System.out.println("none");
            else System.out.println();

        }
    }
}
