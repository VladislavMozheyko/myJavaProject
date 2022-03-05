package home.work2;
import java.util.Scanner;
public class Metod2 {
    public static void main(String[] args){
        number();

    }
    public static void number(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a =scan.nextInt();
        if(a>=0){
            System.out.println("Your number is positive.");
        }else if(a<0){
            System.out.println("Your number is negative.");
        }
    }
}
