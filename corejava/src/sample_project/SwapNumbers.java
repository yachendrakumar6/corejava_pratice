package sample_project;

public class SwapNumbers {
    public static void main(String[] args) {
        int a =10;

        int b=20;

        a =a-b;
        b=a+b;
        a=b-a;

       // b = b+a-(a=b);

        System.out.println("After Swapping : \n"+"a  : "+a+"\tb  : "+b);

        int m =10;

        int n =20;

        n = m+n-(m=n);
        System.out.println("After Swapping : \n"+"m  : "+m+"\tn  : "+n);
    }
}
