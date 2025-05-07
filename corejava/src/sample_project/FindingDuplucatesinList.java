package sample_project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingDuplucatesinList {
    public static void main(String[] args) {

        List<String> companies = new ArrayList<String>();


        // 1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate


        // 2 print original List to console
        System.out.println("1. Original List with duplicates : \n");
        companies.forEach(System.out::println);


        // 3. get unique elements after removing duplicates
        List<String> distinctCompanies = companies.stream().distinct().collect(Collectors.toList());

        // 4 print unique elements
        System.out.println("\n2. Unique elements : \n");
        distinctCompanies.forEach(System.out::println);


        //5. get duplicate elements
        for (String distinctCompany : distinctCompanies) {
            companies.remove(distinctCompany);
        }


        //6. print duplicate elements
        System.out.println("\n3. Duplicate elements : \n");
        companies.forEach(System.out::println);
    }
}
