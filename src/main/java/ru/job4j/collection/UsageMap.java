package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("deniskras@gmail.com", "Denis Krasnoshtan");
        map.put("deniskras@yandex.ru", "Denis Krasnoshtan");
        map.put("deniskras@rambler.ru", "Denis Krasnoshtan");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
