package home.work4;

public class Park {
    public String parkName;
    public Park(String parkName){
        this.parkName=parkName;
        System.out.println("Приветствуем вас в парке "+parkName);
        attractions[] arr=new attractions[4];
        arr[0]=new attractions("Карусель ",8,100);
        arr[1]=new attractions("Батут ",12,80);
        arr[2]=new attractions("Гонки ",4,300);
        arr[3]=new attractions("Горка ",10,50);
        for (int i=0; i< arr.length;i++){
            System.out.println("Атракцион: "+arr[i].name+" работает на протяжении: "+arr[i].time+" часов. Цена за данный атракцион: "+arr[i].price+" руб.");
        }

    }
    class attractions{
        String name;
        int time;
        int price;
        public attractions(String name,int time,int price){
            this.name=name;
            this.time=time;
            this.price=price;
        }
    }
}
