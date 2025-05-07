package sample_project;

import java.util.HashMap;

public class MostRepeatedChars {
    public static void main(String[] args) {
         String str = "yachendrakumaryadav";

        HashMap<Character,Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()){
            if (charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }
            else {
                charCount.put(c, 1);
            }
        }

        char mostRepeatedChar = ' ';
        int maxCount =0;

        for (char c : charCount.keySet())
        {
            if (charCount.get(c)>maxCount)
            {
                mostRepeatedChar =  c;
                maxCount=charCount.get(c);
            }
        }

        System.out.println("The character that occurs most repeated character is '" + mostRepeatedChar + "', which appears " + maxCount + " times.");

    }
}
