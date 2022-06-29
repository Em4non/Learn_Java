package HomeWork_4.自定义接口;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayIntegerStack ais = new ArrayIntegerStack(n);
        int m = scanner.nextInt();
        while (m-- > 0) {
            int item = scanner.nextInt();
            System.out.println(ais.push(item));
        }
        System.out.println(ais.peek() + "," + ais.empty() + "," + ais.size());
        System.out.println(ais);
        int x = scanner.nextInt();
        while (x-- > 0) {
            System.out.println(ais.pop());
        }
        System.out.println(ais.peek() + "," + ais.empty() + "," + ais.size());
        System.out.println(ais);
    }
}
