package HomeWork_4.USB接口的定义;

public class Mouse implements USB {

    @Override
    public void work() {
        System.out.println("我点点点");
    }

    @Override
    public void stop() {
        System.out.println("我不能点了");
    }
}
