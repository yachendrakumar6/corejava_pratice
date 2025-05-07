package sample_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthSort {
    public static void main(String[] args) {
        String text = "GeeksforGeeks I from am";
        List<String> list = Arrays.asList(text.split(" "));
       list.sort((first,second) ->Integer.compare(first.length(),second.length()));
       for (String num : list){
           System.out.print(num+" ");
       }

        System.out.println("\t");
        String[] str = {"GeeksforGeeks", "I", "from", "am"};
        //using for loop
         Arrays.sort(str,Comparator.comparing(a -> a.length()));
         for (int i=0;i< str.length;i++){
             System.out.print(str[i]+" ");
         }
 }
}
