package HomeWork_2.N个数的排序与查;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                System.out.println(i+1);
                flag=true;
            }
        }
        if(flag==false) System.out.println("-1");
    }
}
