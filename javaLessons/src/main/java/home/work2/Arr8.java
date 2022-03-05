package home.work2;

public class Arr8 {
    public static void main(String[] args) {
        arrD();
    }
    public static void arrD(){
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j||i==0&&j==3||i==1&&j==2||i==2&&j==1||i==3&&j==0 ) {
                    System.out.print("1 ");
                } else  {
                    System.out.print("0 ");
                }
            }System.out.println(" ");
        }
        System.out.println(" ");
    }

    }

