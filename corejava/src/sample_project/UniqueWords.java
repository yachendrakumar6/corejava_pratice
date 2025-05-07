package sample_project;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String strr = "Hai Hello How are you yachendra yachendra how are you please can you do work for me";
        strr = strr.toLowerCase();
        String[] word = strr.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(word));
        for (String name : set){
            System.out.print(name +" ");
        }
        System.out.println("\n");



        //second method
        String str = "Hai Hello How are you yachendra yachendra how are you please can you do work for me";
        str = str.toLowerCase();
        String[] words = str.split(" ");
        List<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
        for(int i=1; i<uniqueWords.size(); i++) {
            for(int j=0;j<i;j++) {
                if(uniqueWords.get(i).equals(uniqueWords.get(j))) {
                    uniqueWords.remove(i);
                    i--;
                    break;
                }
            }
        }

        for(String s: uniqueWords) {
            System.out.print(s+" ");
        }
    }
}
