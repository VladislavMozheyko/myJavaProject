package home.work2;

public class Arr7 {
    public static void main(String[] args){
        int[] arr={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0;i< arr.length;i++){
            System.out.print("arr["+i+"]"+"-"+arr[i]+" ");
        }
        System.out.println("");
        for (int i=0;i< arr.length;i++){
            if(arr[i]<6){
                arr[i]*=2;
                System.out.print("arr["+i+"]"+"-"+arr[i]+" ");
            }
        }
    }
}
