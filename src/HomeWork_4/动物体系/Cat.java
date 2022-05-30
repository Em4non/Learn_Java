package HomeWork_4.动物体系;

public class Cat extends Animal {
    String eyesColor;

    Cat(String name, String color, String eyesColor) {
        this.name = name;
        this.color = color;
        this.eyesColor = eyesColor;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", my color is " + color + ", my eyecolor is " + eyesColor);
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}
