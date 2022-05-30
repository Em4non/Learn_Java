package HomeWork_4.学生体系;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        String name = scan.next();
        String sex = scan.next();
        Student s = new Student(no, name, sex);
        s.print();

        no = scan.nextInt();
        name = scan.next();
        sex = scan.next();
        String major = scan.next();
        CollegeStudent c = new CollegeStudent(no, name, sex, major);
        c.print();

        no = scan.nextInt();
        name = scan.next();
        sex = scan.next();
        major = scan.next();
        String supervisor = scan.next();
        GraduateStudent g = new GraduateStudent(no, name, sex, major, supervisor);
        g.print();
        g.doResearch();
        scan.close();
    }
}

/* 你的代码被嵌在这里*/
