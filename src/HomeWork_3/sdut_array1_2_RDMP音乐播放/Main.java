package HomeWork_3.sdut_array1_2_RDMP音乐播放;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        char[] chs = new char[m];
        for (int i = 0; i < m; i++) chs[i] = (char) ('A' + i);
        int n = sc.nextInt();
        int t;
        char ch;
        for (int i = 0; i < n; i++) {
            t = sc.nextInt();
            switch (t) {
                case 1:
                    ch = chs[0];
                    for (int j = 0; j < chs.length - 1; j++) {
                        chs[j] = chs[j + 1];
                    }
                    chs[chs.length - 1] = ch;
                    break;
                case 2:
                    ch = chs[chs.length - 1];
                    for (int j = chs.length - 1; j >= 0; j--) {
                        if (j != 0) chs[j] = chs[j - 1];
                    }
                    chs[0] = ch;
                    break;
                case 3:
                    ch = chs[0];
                    chs[0] = chs[1];
                    chs[1] = ch;
                    break;
            }

        }
        System.out.print(chs[0]);
        for (int i = 1; i < m; i++) {
            System.out.print("," + chs[i]);
        }
    }
}
