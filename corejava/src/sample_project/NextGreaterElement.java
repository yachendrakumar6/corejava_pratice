package sample_project;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num = { 13, 7, 6, 12, 10 };
        int next ;
        for (int i=0;i<num.length;i++) {
            next = -1;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    next = num[j];
                    break;
                }
            }
            System.out.print(next+", ");
        }
    }
}
