package home.work4;

import java.util.Scanner;

public class Payment {
    public String name = "";

    public Payment(String name) {
        this.name = name;
        Product[] prods = new Product[3];
        prods[0] = new Product(1, " Молоко ", 2);
        prods[1] = new Product(2, " Хлеб ", 1);
        prods[2] = new Product(3, " Мясо ", 4);
        for (int i = 0; i < prods.length; i++) {
            System.out.println("Сегодня в продаже товар № " + prods[i].number + prods[i].name + "цена " + prods[i].price);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите номер товара который хотите купить: ");
        int num = scan.nextInt();
        if (num == prods[0].number || num == prods[1].number || num == prods[2].number) {
            System.out.println("Товар под номером  " + num + " добавлен в корзину");
        } else {
            System.out.println("Не верно указан номер товара!");
        }
    }

    class Product {
        int number;
        String name;
        int price;

        public Product(int number, String name, int price) {
            this.number = number;
            this.name = name;
            this.price = price;

        }
    }


}

