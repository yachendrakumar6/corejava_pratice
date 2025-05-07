package sample_project;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddNumArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of Integers in an array : "+sum);

        //Method2
        long summ = IntStream.of(arr).sum();
        System.out.println("using Intstream : "+summ);

        //Method3
        int sum2 = Arrays.stream(arr).sum();
        System.out.println("using stream : "+sum2);

        //Method4
        int addArray =0;
        for (int su :arr){
            addArray += su;
        }
        System.out.println("using for each method : "+addArray);
    }
}
