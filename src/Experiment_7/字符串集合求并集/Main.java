package Experiment_7.字符串集合求并集;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        while (s1.size() < 5) s1.add(sc.next());
        while (s2.size() < 5) s2.add(sc.next());
        Set<String> s3 = new HashSet<>();
        s3.addAll(s1);
        s3.addAll(s2);
        String arr[] = new String[s3.size()];
        int i = 0;
        for (String s : s3
        ) {
            arr[i++] = s;

        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}
