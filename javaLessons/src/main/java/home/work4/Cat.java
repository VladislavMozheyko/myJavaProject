package home.work4;


public class Cat extends Animal {
    public static int count = 0;


    public Cat(String name, String type) {
        super(name, type);
        count++;
    }

    @Override
    public void maxSwim(int dist) {
        System.out.println("коты не умеют плавать.");
    }
}
