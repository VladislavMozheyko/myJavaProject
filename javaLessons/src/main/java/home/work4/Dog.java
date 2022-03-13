package home.work4;

public class Dog extends Animal {
    public static int count = 0;

    public Dog(String name, String type) {
        super(name, type);
        count++;
    }

}
