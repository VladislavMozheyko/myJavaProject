package home.work4;


public class Cat extends Animal {


    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public void maxSwim(int dist) {
        System.out.println("коты не умеют плавать.");
    }
}
