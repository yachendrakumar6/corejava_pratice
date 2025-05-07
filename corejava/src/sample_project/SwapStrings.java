package sample_project;

public class SwapStrings {
    public static void main(String[] args) {
         String str1 = "yachendra";
         String str2 = "kumar";
         str1 = str1+str2;
         str2= str1.replace(str2,"");
        str1= str1.replace(str2,"");
        System.out.println("String1 : "+str1+"\tString2 : "+str2);
    }
}
