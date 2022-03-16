package home.work4;

public class Dog extends Animal {
    public static int count = 0;

    public Dog(String name, String type) {
        super(name, type);
        count++;
    }

    public void maxRun() {
        if (this.run <= 500) {
            System.out.println(type + " " + name + " расстояние забега " + run + "м");
        } else {
            System.out.println(type + " " + name + " расстояние для забега слишком велико.");
        }
    }

    public void maxSwim() {
        if (this.swim <= 10) {
            System.out.println(type + " " + name + " расстояние заплыва " + swim + "м");
        } else {
            System.out.println(type + " " + name + " расстояние для заплыва слишком велико.");
        }
    }
}