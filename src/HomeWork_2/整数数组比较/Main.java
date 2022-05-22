package HomeWork_2.整数数组比较;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int Max=0;
        int Min=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if(a[i]==b[i])d++;
            else if(a[i]>b[i])Max++;
            else if(a[i]<b[i])Min++;
        }
        System.out.println(Max);
        System.out.println(d);
        System.out.println(Min);
    }
}
