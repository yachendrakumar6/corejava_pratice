package sample_project;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Count {
    public static void main(String[] args) {
        String str = "Beauty lies in the eyes of beholder";
        int wordCount = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {
                wordCount++;
            }
        }
        wordCount++;

        System.out.println("Total number of words in the given string: " + wordCount);

        Long result = Arrays.stream(str.split(" "))
                .collect(counting());
        System.out.println("using map\n"+result);

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int count = stringTokenizer.countTokens();
        System.out.println("using string tokenizer no.of words in a string : "+String.valueOf(count));

        String randomText = "The sky is blue it meets the sea which is also blue";
        String text = "blue";
        int times = 0;
        for (int i = 0; i < randomText.length(); i++) {
            if (randomText.substring(i).startsWith(text)) {
                times ++;
            }
        }
        System.out.println(text + " " + times + " times repeated");

        String[] words = str.split("\\s+");
        System.out.println("Word Count is: "+words.length);
    }
}
