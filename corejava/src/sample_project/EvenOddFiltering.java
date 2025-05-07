package sample_project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddFiltering {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(24,3,43,12,32,22,10,52,11,6,64,84,56,95,1);
        //Using Streams and collecting into list
        List<Integer> even = arrayList.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        List<Integer> odd =  arrayList.stream().filter(n -> n%2 ==1).collect(Collectors.toList());
        System.out.println("Even Numbers : "+even);
        System.out.println("Odd Numbers : "+odd);
        //Sum of odd numbers in an array
        int sumOfOddNumbers = arrayList.stream().filter(n -> n%2 ==1).reduce(0,Integer::sum);
        int sumOfEvenNumbers = arrayList.stream().filter(n -> n%2 ==0).reduce(0,Integer::sum);
        System.out.println("Sum of odd Numbers : "+sumOfOddNumbers);
        System.out.println("Sum of even Numbers : "+sumOfEvenNumbers);

        int sumOfSquaresOddNumbers = arrayList.stream().filter(n -> n%2 ==1).map(n -> n*n).reduce(0,Integer::sum);
        int sumOfSquaresEvenNumbers = arrayList.stream().filter(n -> n%2 ==0).map(n -> n*n).reduce(0,Integer::sum);
        System.out.println("Sum of Squares odd Numbers : "+sumOfSquaresOddNumbers);
        System.out.println("Sum of Squares even Numbers : "+sumOfSquaresEvenNumbers);

        //both are equal above and below
        int sumandSquaresOfOddNumbers = arrayList.stream().filter(n -> n%2 ==1).map(n -> n*n).reduce(0,Integer::sum);
        int sumandSquaresOfEvenNumbers = arrayList.stream().filter(n -> n%2 ==0).map(n -> n*n).reduce(0,Integer::sum);
        System.out.println("Sum and Squares of Odd Numbers : "+sumandSquaresOfOddNumbers);
        System.out.println("Sum and Squares of Even Numbers : "+sumandSquaresOfEvenNumbers);


        //Using Core java to find Even and Odd Numbers
        int[] a = {24,3,43,12,32,22,10,52,11,6,64,84,56,95,1};
        int n = a.length;
        int sum =0;
        int rev =0;
        System.out.print("Odd numbers : ");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 1)
            {
                sum +=a[i];
                System.out.print(a[i]+", ");

            }
        }
        System.out.println("\nSum of Odd Numbers : "+sum);
        System.out.print("Even numbers : ");
        for(int j = 0 ; j < n ; j++)
        {
            if(a[j] % 2 == 0)
            {
                System.out.print(a[j]+", ");
                rev +=a[j];
            }
        }
        System.out.println("\nSum of Even Numbers : "+rev);
    }
}
