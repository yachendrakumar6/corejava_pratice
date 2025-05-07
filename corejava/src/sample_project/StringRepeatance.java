package sample_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepeatance {
    public static void main(String[] args) {

        String str = "yachendrakumar";
        int replace = str.replace("a","").length();
        int totalLength = str.length();
        int fnlCount = totalLength-replace;
        System.out.println("using replacing method");
        System.out.println("a is repeated : "+fnlCount);


        System.out.println("using for loop and toCharArray");
        int count =0;
        char stringChar[] = str.toCharArray();
        for (int i=0;i<stringChar.length;i++){
            count=1;
            for (int j=i+1;j<stringChar.length;j++){
                if (stringChar[i]==stringChar[j] && stringChar[i]!=' '){
                        count++;
                    stringChar[j]='0';
                }
            }
            if (count>0 && stringChar[i] !='0'){
                System.out.print(stringChar[i] +":"+count +", ");
            }
        }
        System.out.println("\nusing map function");
        Map<String,Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, HashMap::new,Collectors.counting()));
        System.out.println(result);


        System.out.println("using collections methods");
        str.chars().mapToObj(c->Character.valueOf((char) c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().forEach(s -> System.out.print(s+", "));
    }
}
