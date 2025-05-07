package sample_project;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] a = {2,1,5,1,3,2};
        int k =3;
        int maxSum = 0, subarraySum;
        for (int i = 0; i <= a.length-k; i++) {
            subarraySum = 0;
            for (int j = i; j < i+k; j++) {
                subarraySum += a[j];
            }
            maxSum = Math.max(maxSum, subarraySum);
        }
        System.out.println(maxSum);
    }

}
