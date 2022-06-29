package Experiment_7.手机按价格排序;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class MobilePhone implements Comparable {
    String type;
    int price;

    MobilePhone(String type, int price) {
        this.price = price;
        this.type = type;
    }

    @Override
    public int compareTo(Object o) {
        MobilePhone mobilePhone = (MobilePhone) o;
        return this.price - mobilePhone.price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m1 = new MobilePhone(sc.next(), sc.nextInt());
        MobilePhone m2 = new MobilePhone(sc.next(), sc.nextInt());
        MobilePhone m3 = new MobilePhone(sc.next(), sc.nextInt());
        MobilePhone m4 = new MobilePhone(sc.next(), sc.nextInt());
        LinkedList<MobilePhone> list = new LinkedList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        System.out.println("排序前，链表中的数据：");
        for (MobilePhone m : list
        ) {
            System.out.println("型号：" + m.type + "，价格：" + m.price);
        }
        Collections.sort(list);
        System.out.println("排序后，链表中的数据：");
        for (MobilePhone m : list
        ) {
            System.out.println("型号：" + m.type + "，价格：" + m.price);
        }
        boolean flag = false;
        for (MobilePhone m : list
        ) {
            if (m.price == m4.price) {
                flag = true;
                System.out.println(m4.type + "与链表中的" + m.type + "价格相同");
            }
        }
        if (!flag) System.out.println("链表中的对象，没有一个与" + m4.type + "价格相同的");
    }
}
