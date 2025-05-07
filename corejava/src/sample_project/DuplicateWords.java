package sample_project;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.mapping;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Hai Hello How are you yachendra yachendra how are you please can you do work for me how good it is for you and me";
        str = str.toLowerCase();
        String[] words = str.split(" ");
        int count =0;
        for (int i=0;i<words.length;i++){
        count =1;
            for (int j=i+1;j<words.length;j++){
                if (words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if (count>1 && words[i] !="0"){
                System.out.print(words[i]+" = "+count+", ");
            }
        }
//        Map<String,Long> result = Arrays.stream(str.split(" ")).map(String::toLowerCase)
//                                                      .collect(Collectors.groupingBy(s ->s,LinkedHashMap::new,counting()));
//        System.out.println(result);
    }
}
