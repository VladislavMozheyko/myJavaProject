package home.work1;

public class HomeWorkApp {
    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void  printThreeWords(){

        System.out.println(" Orange\n Banana\n Apple");
    }
    public static void checkSumSign(){
        int a=10;
        int b=15;
        int res=a+b;
        if(res>=0){
            System.out.println("Сумма положительная ");

        }else {
            System.out.println("Сумма отрицательная ");
        }

    }
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a=22;
        int b=16;
        if(a>=b){
            System.out.println("a>=b");
        }else {
            System.out.println("a<b");
        }
    }
    }
