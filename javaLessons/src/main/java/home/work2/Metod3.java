package home.work2;
import java.util.Scanner;
public class Metod3 {
    public static void main(String[] args) {
        System.out.println(num());
    }

    public static boolean num() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        if(a >= 0) {
            return false;
        } else {
            return true;
        }
    }
}



