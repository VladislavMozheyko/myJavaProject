package home.work4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cat cat1 = new Cat("Боря", "кот");
        Dog dog1 = new Dog("Тузик", "собака");
        System.out.print("Введите расстояние для забега " + cat1.type + " " + cat1.name + " ");
        cat1.run = scan.nextInt();
        System.out.print("Введите расстояние для заплыва " + cat1.type + " " + cat1.name + " ");
        cat1.swim = scan.nextInt();
        cat1.maxRun();
        cat1.maxSwim();
        System.out.println();
        System.out.print("Введите расстояние для забега " + dog1.type + " " + dog1.name + " ");
        dog1.run = scan.nextInt();
        System.out.print("Введите расстояние для заплыва " + dog1.type + " " + dog1.name + " ");
        dog1.swim = scan.nextInt();
        dog1.maxRun();
        dog1.maxSwim();
        System.out.println();
        System.out.println("Было создано: " + Animal.count + " животных.\n" + "Было создано собак : " + Dog.count + "\nБыло создано котов: " + Cat.count);
    }
}
