package home.work4;


public class Cat extends Animal {
    public static int count = 0;


    public Cat(String name, String type) {
        super(name, type);
        count++;
    }

    public void maxRun() {
        if (this.run <= 200) {
            System.out.println(type + " " + name + " расстояние забега " + run + "м");
        } else {
            System.out.println(type + " " + name + " расстояние для забега слишком велико.");
        }
    }

    public void maxSwim( ) {
        if (this.swim <= 0) {
            System.out.println(type + " " + name + " расстояние заплыва " + swim + "м");
        } else {
            System.out.println(" Коты не умеют плавать!");
        }
    }
}