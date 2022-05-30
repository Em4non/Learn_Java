package HomeWork_4.员工的工资;

public class Manager extends Employee {
    int salary;

    public Manager(int managerSalary) {
        this.salary = managerSalary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
