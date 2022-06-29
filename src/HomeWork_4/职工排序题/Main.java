package HomeWork_4.职工排序题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("1", 500, 400, "职工1", "female"));
        list.add(new Employee("2", 400, 600, "职工2", "female"));
        list.add(new Employee("3", 600, 300, "职工3", "male"));
        list.add(new Employee("4", 800, 200, "职工4", "female"));
        list.add(new Employee("5", 500, 700, "职工5", "male"));
        System.out.println("编号,团险,个险,姓名,性别");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("编号,团险,个险,姓名,性别");
        Collections.sort(list, new SumComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}

class SumComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSumYJ() - o2.getSumYJ();
    }
}

class Employee implements Comparable {
    String id, name, sex;
    int sumYJ, singleYJ;

    @Override
    public String toString() {
        return id + ',' + getSumYJ() + ',' + getSingleYJ() + ',' + getName() + "," + getSex();
    }

    public Employee() {
    }

    public Employee(String id, int sumYJ, int singleYJ, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.sumYJ = sumYJ;
        this.singleYJ = singleYJ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSumYJ() {
        return sumYJ;
    }

    public void setSumYJ(int sumYJ) {
        this.sumYJ = sumYJ;
    }

    public int getSingleYJ() {
        return singleYJ;
    }

    public void setSingleYJ(int singleYJ) {
        this.singleYJ = singleYJ;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        int result = this.getSumYJ() + this.getSingleYJ() - employee.getSumYJ() - employee.getSingleYJ();
        return result;
    }
}