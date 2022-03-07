package home.work2;
import java.util.Scanner;
public class Metod4 {
    public static void main(String[] args) {
        printWord();
    }
    public static void printWord() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите ваш текст: ");
       String a=scan.nextLine();
        System.out.print("Введите число повторений: ");
        int b=scan.nextInt();
     for (int i=0; i<b;i++){
         System.out.println(a);
     }
    }
}
