package sample_project;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("sonu", 50);
        map.put("swagatika", 40);

        map.entrySet().stream().sorted(Entry.<String, Integer>comparingByValue()).forEach(System.out::println);

        System.out.println("By using the Map.Entry.comparingByValue()");
        map.entrySet()
                .stream()
                .sorted(Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("using the iterator in the hashmap");
        Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
            System.out.println("using the lambdas");
            map.forEach((k, v) -> System.out.println((k + ":" + v)));

        }
    }
}
