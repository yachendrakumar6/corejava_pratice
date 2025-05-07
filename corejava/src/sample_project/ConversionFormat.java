package sample_project;

public class ConversionFormat {
    public static void main(String[] args) {
        Integer num = new Integer(20);
        String binary = Integer.toBinaryString(num);
        System.out.println("binary value :  "+binary);
        //HexaDecimal value
        String hexadecimal = Integer.toHexString(num);
        System.out.println("hexadecimal value :  "+hexadecimal);

        //OctaDecimal value
        String octadecimal = Integer.toOctalString(num);
        System.out.println("octadecimal value :  "+octadecimal);


        //Converting octal value into integer
        String octal = "24";
        Integer i = Integer.parseInt(octal,8);
        System.out.println("Conversion of octal value to int : "+i);

        String binary1 = "10100";
        Integer ii = Integer.parseInt(binary1,2);
        System.out.println("Conversion of binary value to int : "+ii);

        String hexa = "14";
        Integer hi = Integer.parseInt(hexa,16);
        System.out.println("Conversion of hexa value to int : "+hi);
    }
}
