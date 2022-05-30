package HomeWork_4.动物体系;

import java.util.Scanner;

/*你的代码被嵌在这里 */

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        Animal a = null;
        if (i == 1) {
            a = new Cat(s.next(), s.next(), s.next());
        } else if (i == 2) {
            a = new Dog(s.next(), s.next(), s.nextInt());
        }
        TestAnimal.introduce(a);
        TestAnimal.action(a);

    }
}
