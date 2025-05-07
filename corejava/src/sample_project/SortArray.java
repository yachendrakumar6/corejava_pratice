package sample_project;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        String[] fruitNames = {"banana","apple","pineapple","mango","kiwi","papaya","grapes","guava","pomegranate","oranges"};
        String temp ;
        for (int i=0;i<fruitNames.length;i++){
            for (int j=i+1;j<fruitNames.length;j++){
                if (fruitNames[i].compareTo(fruitNames[j])>0){
                     temp = fruitNames[i];
                    fruitNames[i]=fruitNames[j];
                    fruitNames[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array using core java : ");
        for (String fruitNamesSorted : fruitNames){
            System.out.print(fruitNamesSorted+" ");
        }
    //Method 2 using Arrays.sort method
        Arrays.sort(fruitNames);
        System.out.println("\nUsing Arrays.sort Method : ");
        System.out.println(Arrays.toString(fruitNames));

    }
}
