package home.work8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<Integer, String> phonebook;

    public PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void add(int number, String name) {
        phonebook.put(number, name);
    }

    public void get(String name) {
        if (phonebook.containsValue(name)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if (temp.getValue().equals(name)) {
                    System.out.println(temp.getValue() + ":" + temp.getKey());
                }
            }
        } else {
            System.out.println("Данного человека нет в справочнике.");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(3554819, "Кузьма");
        phoneBook.add(2026671, "Грозный");
        phoneBook.add(2946019, "Кузьма");
        phoneBook.add(7421100, "Грозный");
        phoneBook.add(3341122, "Кукушкина");
        phoneBook.add(9023118, "Рубака");
        phoneBook.add(1022218, "Грозный");
        phoneBook.get("Грозный");
        phoneBook.get("Кузьма");
        phoneBook.get("Кукушкина");
        phoneBook.get("Рубака");
        phoneBook.get("Можейко");
    }
}
