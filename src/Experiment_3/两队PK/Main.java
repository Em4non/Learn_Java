package Experiment_3.两队PK;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        int[] teamA = new int[a];
        for (int i = 0; i < a; i++) {
            teamA[i] = sc.nextInt();
        }
        b = sc.nextInt();
        int[] teamB = new int[b];
        for (int i = 0; i < b; i++) {
            teamB[i] = sc.nextInt();
        }
        int[] ans = new int[a + b];
        System.arraycopy(teamA, 0, ans, 0, a);
        System.arraycopy(teamB, 0, ans, a, a + b - a);
        Arrays.sort(ans);
        int t1 = ans[ans.length - 1], t2 = ans[ans.length - 2], t3 = ans[ans.length - 3];
        Arrays.sort(teamA);
        Arrays.sort(teamB);
        a = 0;
        b = 0;
        if (Arrays.binarySearch(teamA, t1) < 0) b++;
        else a++;
        if (Arrays.binarySearch(teamA, t2) < 0) b++;
        else a++;
        if (Arrays.binarySearch(teamA, t3) < 0) b++;
        else a++;
        System.out.println(t1 + " " + t2 + " " + t3);
        if (a > b) System.out.println("A");
        else System.out.println("B");
    }
}
