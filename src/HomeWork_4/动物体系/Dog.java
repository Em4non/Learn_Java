package HomeWork_4.动物体系;

public class Dog extends Animal {
    int iq;

    Dog(String name, String color, int iq) {
        this.name = name;
        this.color = color;
        this.iq = iq;
    }

    public void catchFrisbee() {
        System.out.println("catch frisbee");
    }

    public void introduce() {
        System.out.println("My name is " + name + ", my color is " + color + ", my IQ is " + iq);
    }

    public int getIq() {
        return iq;
    }
}
