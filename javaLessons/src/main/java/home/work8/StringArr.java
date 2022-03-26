package home.work8;

import java.util.*;

public class StringArr {
    public static void main(String[] args) {
        String[] arr = {"Федя", "Петя", "Вова", "Влад", "Федя", "Влад", "Артем", "Петя", "Александр", "Иван"};
        List<String> list = Arrays.asList(arr);
        Set<String> arrHesh = new HashSet<String>(list);
        System.out.println("Список уникальных слов из которых состоит массив: " + arrHesh);
        System.out.println("Сколько раз встречается каждое слово:");
        for (String key : arrHesh) {
            System.out.println(key + ": " + Collections.frequency(list, key));
        }

    }
}
