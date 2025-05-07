package sample_project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static void main(String[] args) {
        //Number Array Reverse
        int[] num = {5,3,2,4,1,5,6,4,3};
        System.out.println("Reversed Number Array : ");
        for (int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }

        //String Array Reverse
        String arr[] = {"yachi","ramu","sony","suma"};
        System.out.println("\nReversed String Array :");
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
