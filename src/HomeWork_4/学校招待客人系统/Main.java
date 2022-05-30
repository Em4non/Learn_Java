package HomeWork_4.学校招待客人系统;

/**
 * 编写一个学校接待方面的程序，招待不同身份的人的食宿问题
 */
public class Main {
    public static void main(String[] args) {
        entertain(new Student());
        entertain(new Teacher());
    }

    private static void entertain(Person p) {
        p.eat();
        p.sleep();
    }
}

// 请在下面的 Begin-End 之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 定义一个接口类 Person

// 定义 eat()，实现输出吃饭的功能，无返回值

// 定义 sleep()，实现睡觉的功能，无返回值

// 定义一个 Student 类并实现 Person 接口

// 实现 eat()：输出：“学生去食堂吃饭。”；

// 实现 sleep()：输出：“学生在宿舍睡觉。”。

// 定义一个 Teacher 类并实现 Person 接口

// 实现 eat()：输出：“老师去教师食堂吃饭。”；

// 实现 sleep()：输出：“老师在学校公寓睡觉。”。

/********** End **********/
