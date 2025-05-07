package sample_project;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("hashmap coding interview questions", "AT INTERVEWBIT");
        map.put("hashmap programming interview questions", "AT INTERVEWBIT");

        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ",\t Value = " + entry.getValue());
    }
}
