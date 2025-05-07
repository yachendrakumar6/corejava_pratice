package sample_project;

import com.sun.org.apache.xml.internal.utils.StringComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Russia", "India", "China", "Japan", "Ghana");

        List<String> caseIgnore = Arrays.asList("Russia", "India", "china", "Japan", "ghana");

        caseIgnore.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(caseIgnore);

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        String str = "geeksforgeeks";
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
        System.out.println("\n");
        List<String> ascendingOrder = list.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
        List<String> descendingOrder = list.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(ascendingOrder);
        System.out.println(descendingOrder);

//        list.sort(Comparator.comparing(e ->e.getFirstName));
//        list.sort(Comparator.comparing(Employee :: getFirstName));
//        list.sort(Comparator.comparing(Employee :: getFirstName).thenComapring(Employee :: getLastName));
    }
}