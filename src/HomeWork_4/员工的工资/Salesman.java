package HomeWork_4.员工的工资;

public class Salesman extends Employee {
    int salary;
    int raise;

    Salesman(int salary, int raise) {
        this.salary = salary;
        this.raise = raise;
    }

    @Override
    public int getSalary() {
        return salary + raise;
    }
}
