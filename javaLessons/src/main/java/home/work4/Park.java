package home.work4;

public class Park {
    public String parkName;
    public Park(String parkName){
        this.parkName=parkName;
        System.out.println("Приветствуем вас в парке "+parkName);
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

