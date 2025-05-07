package sample_project;

public class CharRepeatance {
    public static void main(String[] args) {
          String str = "yachendrakumar";
          int count = 0;
          char c = 'z';
          for (int i=0;i<str.length();i++){
              if (str.charAt(i)==c){
                  count++;
              }
          }
        System.out.println("z is repeated : "+count);

          //Method 2

        int totalLength = str.length();
        int counta = str.replace("a","").length();
        int finalCount = totalLength-counta;
        System.out.println("a is repeated : "+finalCount);
    }
}
