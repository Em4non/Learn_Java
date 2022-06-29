package HomeWork_4.USB接口的定义;

public class UPan implements USB {
    @Override
    public void work() {
        System.out.println("我存存存");
    }

    @Override
    public void stop() {
        System.out.println("我走了");
    }
}
