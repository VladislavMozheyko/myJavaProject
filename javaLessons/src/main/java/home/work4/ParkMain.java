package home.work4;

public class ParkMain {
    public static void main(String[] args) {
        Park nums1 = new Park("Развлекуха");
        attractions[] arr = new attractions[4];
        arr[0] = new attractions("Карусель ", 8, 100);
        arr[1] = new attractions("Качели ", 10, 80);
        arr[2] = new attractions("Гонки ", 12, 400);
        arr[3] = new attractions("Батут ", 9, 50);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name+" работает в течении "+arr[i].time+" часов. Цена билета: "+arr[i].price+" руб.");
        }
    }
}
