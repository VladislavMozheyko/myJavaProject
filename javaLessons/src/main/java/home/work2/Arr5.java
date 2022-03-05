package home.work2;

public class Arr5 {
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxArr = arr.length;
        for(int i = 0; i < maxArr; i++){
            System.out.print (i + "-" + arr[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxArr; i++){
            if(arr[i] == 1) {
                arr[i] = 0;
            }else arr[i] = 1;
            System.out.print (i + "-" + arr[i]+" ");
        }
    }
}


