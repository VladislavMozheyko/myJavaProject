package home.work4;


public class Animal {
    public int run, swim;
    public String name, type;
    public static int count = 0;


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        count++;
    }

    public void printInfo() {
        System.out.println(name + " пробежал " + run + "м " + name + " проплыл " + swim + "м");
    }
}