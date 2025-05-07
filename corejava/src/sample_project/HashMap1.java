package sample_project;

import java.util.*;


public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "Geeks");
        map.put(15, "for");
        map.put(20, "Geeks");
        map.put(25, "Welcomes");
        map.put(30, "You");

        System.out.println(map.size());

        System.out.println(map);
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        }

        for (Integer key : map.keySet())
            System.out.println("key: " + key);

        // using values() for iteration over values
        for (String values : map.values()){
            System.out.println("value: " + values);
        }


        Iterator itr=map.keySet().iterator();
        while(itr.hasNext())
        {
            int key=(int)itr.next();
            System.out.println("Number "+key+"     name:   "+map.get(key));
        }
        System.out.println("using LinkedHashMap sorting ");
        Map<Integer,String> sortedMap = new LinkedHashMap<>();
        sortedMap.putAll(map);
        Iterator it=map.keySet().iterator();
        while(it.hasNext())
        {
            int keys=(int)it.next();
            System.out.println("Number "+keys+"     name:   "+map.get(keys));
        }

    }
}
