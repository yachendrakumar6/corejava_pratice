package sample_project;

public class AddNumArrays1 {
    public static void main(String[] args) {
        //using recursion
        int[] arr = {1,2,3,4,5};
        int sum = sum(arr,arr.length-1);
        System.out.println("The sum of the array elements is : " + sum);
    }

    private static int sum(int[] arr, int index) {
        if (index==0){
            return arr[0];
        }
        return arr[index]+sum(arr, index-1);
    }
}
