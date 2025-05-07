package sample_project;


public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1221;
        int r,sum =0;
        int temp=num;
        while (num>0){
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if (temp==sum){
            System.out.println(sum+" is a palindrome number");
        }else {
            System.out.println(sum+" is not a palindrome number");
        }
    }
}

