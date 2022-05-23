package HomeWork_3.公司季度销售额以及年销售额统计;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] account = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                account[i][j] = sc.nextInt();
            }
        }
        int t = 0, sum = 0;
        for (int i = 0; i < 4; i++) {
            t = 0;
            for (int j = 0; j < 3; j++) {
                t += account[i][j];
            }
            sum += t;
            System.out.println((i + 1) + "季度的销售额为：" + t);
        }
        System.out.println("全年销售额为：" + sum);
    }
}
