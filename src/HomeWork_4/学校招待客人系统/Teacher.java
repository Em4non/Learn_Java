package HomeWork_4.学校招待客人系统;

public class Teacher implements Person {
    @Override
    public void eat() {
        System.out.println("老师去教师食堂吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("老师在学校公寓睡觉。");
    }
}
