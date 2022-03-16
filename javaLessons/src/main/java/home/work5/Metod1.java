package home.work5;
import java.util.Arrays;

public class Metod1 {
    public static void main(String[] args) {
        String[] fruts = {"apple", "orange"};
        for (int i = 0; i < fruts.length; i++) {
            System.out.println(Arrays.toString(fruts));
            swap(fruts,0,1);
        }
    }
        private static  void  swap(String[] arr, int index1,int index2){
            String type=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=type;
        }


}
