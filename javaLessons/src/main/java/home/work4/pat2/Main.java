package home.work4.pat2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Жучка", 10, false);
        cats[1] = new Cat("Васька", 38, false);
        cats[2] = new Cat("Зилибоба", 25, false);
        Plate plate = new Plate(60);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].fullness == false && cats[i].appetite < plate.food) {
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("кот " + cats[i].name + " покушал");
            } else {
                System.out.println("кот " + cats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить в тарелку? ");
        int feed = scan.nextInt();
        plate.increaseFood(feed);
        plate.info();
    }
}