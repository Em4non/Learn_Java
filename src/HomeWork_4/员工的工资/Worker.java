package HomeWork_4.员工的工资;

public class Worker extends Employee {
    int day;
    int salary;

    Worker(int day, int salary) {
        this.day = day;
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return day * salary;
    }
}
