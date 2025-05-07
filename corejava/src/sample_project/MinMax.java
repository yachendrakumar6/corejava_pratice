package sample_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {24,3,45,12,32,22,10,52,11,6,64,84,56,95,1};
        int max = arr[0];
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The minimum number in an array : "+min);
        for (int j=0;j<arr.length;j++){
            if (max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println("The maximum number in an array : "+max);
        //Method 1
        List<Integer> arrayList = Arrays.asList(24,3,45,12,32,22,10,52,11,6,64,84,56,95,1);
        int max1 = Collections.max(arrayList);
        int min1 =  Collections.min(arrayList);
        System.out.println("Using Collections.Max()  and Collections.Min() ");
        System.out.println("Max = "+max1+"\tMin = "+min1);

        //Method 2
        System.out.println("Using Arrays.stream(arr)");
        int max2 = Arrays.stream(arr).max().getAsInt();
        int min2 = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max = "+max2+"\tMin = "+min2);

        //Method 3
        System.out.println("Using IntStream.of(arr)");
        int max3 = IntStream.of(arr).max().getAsInt();
        int min3 = IntStream.of(arr).min().getAsInt();
        System.out.println("Max = "+max3+"\tMin = "+min3);

        //Method 4
        System.out.println("Using SummaryStatistics");
        int max4 = Arrays.stream(arr).summaryStatistics().getMax();
        int min4 = Arrays.stream(arr).summaryStatistics().getMin();
        System.out.println("Max = "+max4+"\tMin = "+min4);

        //Method 5
        Arrays.sort(arr);
        int max5 = arr[arr.length - 1];
        int min5 = arr[0];
        System.out.println("Using Sorting");
        System.out.println("Max = "+max5+"\tMin = "+min5);
    }
}