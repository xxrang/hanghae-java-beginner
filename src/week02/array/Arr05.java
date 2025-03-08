package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자 (char, 1byte), 문자열(String)
        // String = char[]

        String str = "ABCD";

        int strLength = str.length();
        System.out.println(strLength);

        char strChar = str.charAt(1);
        System.out.println(strChar);

        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // String -> char[]
        char[] strCharArray = str.toCharArray();

        // char[] -> String
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
