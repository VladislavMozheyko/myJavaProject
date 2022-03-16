package home.work4;


public class Animal {
    public int run, swim;
    public String name, type;
    public static int count=0;


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        count++;
    }

    public void maxRun(int dist) {
        if (this.run <= dist) {
            System.out.println(type + " " + name + " расстояние забега " + run + "м");
        } else {
            System.out.println(type + " " + name + " расстояние для забега слишком велико.");
        }
    }

    public void maxSwim(int dist) {

        if (this.swim <= dist) {
            System.out.println(type + " " + name + " расстояние заплыва " + swim + "м");
        } else {
            System.out.println(type + " " + name + " расстояние для заплыва слишком велико.");
        }
    }

    public void printInfo() {
        System.out.println(name + " пробежал " + run + "м " + name + " проплыл " + swim + "м");
    }
}