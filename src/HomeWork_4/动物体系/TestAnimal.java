package HomeWork_4.动物体系;

public class TestAnimal {

    public static void action(Animal animal) {
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.catchFrisbee();
        } else {
            Cat c = (Cat) animal;
            c.catchMouse();
        }
    }

    public static void introduce(Animal animal) {
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.introduce();
        } else {
            Cat c = (Cat) animal;
            c.introduce();
        }
    }
}
