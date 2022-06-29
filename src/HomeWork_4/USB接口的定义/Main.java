package HomeWork_4.USB接口的定义;

public class Main {
    public static void main(String[] args) {
        USB usb1;
        usb1 = new Mouse();
        usb1.work();
        usb1.stop();
        USB[] usbs = new USB[2];
        usbs[0] = new UPan();
        usbs[1] = new Mouse();
        for (USB i : usbs
        ) {
            i.work();
            i.stop();

        }
    }
}
