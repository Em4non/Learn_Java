package HomeWork_4.学校招待客人系统;

public class Student implements Person {
    @Override
    public void eat() {
        System.out.println("学生去食堂吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("学生在宿舍睡觉。");
    }
}
