package sample_project;

public class VowelsinStrng {
    public static void main(String[] args) {
        String str = "yachendrakumar";
        String str1 = "shy";
        boolean result = str.toLowerCase().matches(".*[aeiou].*");
        boolean result1 = str1.toLowerCase().matches(".*[aeiou].*");
        System.out.println(result);
        System.out.println(result1);
    }
}
