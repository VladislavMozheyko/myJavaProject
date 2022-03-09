package home.work3;

public class Main {
    public static void main(String[] args) {
        Сотрудник[] persArr=new Сотрудник[5];
        persArr[0]=new Сотрудник("Булкин Александр Ваильевич ","Повар ","BulkaVasya@gmail.com ","+375336192754 ","300$ ",28);
        persArr[1]=new Сотрудник("Кузьма Аркадий Петрович ","Баянист ","Kuza-Petrovich@mail.ru ","+37529447162345 ","400$ ",47);
        persArr[2]=new Сотрудник("Дырко Иван Сергеевич ","Стамотолог ","Dzirko@yandex.ru ","+375292945518 ","1000$ ",51);
        persArr[3]=new Сотрудник("Запивало Алина Александровна ","Товаровед ","AlinaZapivalo@mail.ru ","+375296771200 ","350$ ",33);
        persArr[4]=new Сотрудник("Язь Алла Леонидовна ","Учитель ","Yazik@yahoo.com ","+375337881299 ","300$ ",45);
        for(int i=0;i< persArr.length;i++){
         if(persArr[i].возраст>40){
             persArr[i].info();
         }
        }
    }
    }