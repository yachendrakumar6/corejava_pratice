package sample_project;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "abba";
        //Method 1
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String strr = sb.toString();
       if (str.equals(strr)){
           System.out.println("Given string "+str+" is a palindrome");
       }else {
           System.out.println("Given string "+str+" is not a palindrome");
       }

       //Method 2
       String reverse = "";
       for (int i=str.length()-1;i>=0;i--){
           reverse += str.charAt(i);
       }
        if (str.equals(reverse)){
            System.out.println("Given string "+str+" is a palindrome");
        }else {
            System.out.println("Given string "+str+" is not a palindrome");
        }
    }
}
