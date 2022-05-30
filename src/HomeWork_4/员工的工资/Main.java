package HomeWork_4.员工的工资;
/*你的代码被嵌在这里*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int managerSalary = scan.nextInt();
        int salemanSalary = scan.nextInt();
        int salemanRaise = scan.nextInt();
        int workerEveryday = scan.nextInt();
        int workerDays = scan.nextInt();

        Employee e1 = new Manager(managerSalary);
        Employee e2 = new Salesman(salemanSalary, salemanRaise);
        Employee e3 = new Worker(workerEveryday, workerDays);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());

        scan.close();


    }
}
