package sample_project;

import java.util.Arrays;

public class StringArrayReverse {
    public static void main(String[] args) {
    String arr[] = {"yachi","ramu","sony","suma"};
        System.out.println("String Array Reverse : ");
    for (int i= arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }

        System.out.print("\nNumber Array Reverse : ");
        int arrr[] = {41,25,35,32};
        for (int i= arrr.length-1;i>=0;i--){
            System.out.print(arrr[i]+" ");
        }
    }
}
