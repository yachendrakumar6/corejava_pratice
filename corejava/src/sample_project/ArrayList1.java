package sample_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");
        TreeSet<String> treeSet = new TreeSet<>(cityNames);
        // Iterator to iterate the cityNames
        Iterator iterator = treeSet.iterator();
        System.out.println("CityNames elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " \t");

    }
}
