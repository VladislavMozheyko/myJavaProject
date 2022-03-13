package home.work4.pat2;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int a) {
        food += a;
    }

    public void info() {
        System.out.println("plate: " + food);


    }
}