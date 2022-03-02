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
            System.out.print("Сумма положительная ");

        }else {
            System.out.print("Сумма отрицательная ");
        }

    }
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("\nКрасный");
        } else if (value <= 100) {
            System.out.println("\nЖелтый");
        } else if (value > 100) {
            System.out.println("\nЗеленый");
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
