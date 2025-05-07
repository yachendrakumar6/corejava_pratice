package sample_project;

public class SquaresofNumber {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int squares= 0;
        for(int num : n){
             squares = num*num;
            System.out.println(num+" is a square of : "+squares);
        }

        int square =0;
        int sum =0;
        for (int i = 0; i <n.length; i++) {
            square = n[i]*n[i];
            System.out.println(square);
            sum += square;
        }
        System.out.println(sum);
    }
}
