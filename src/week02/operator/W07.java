package week02.operator;

public class W07 {
    public static void main(String[] args) {
        int intNumber = 93 + (int)98.8;
        System.out.println(intNumber);

        double doubleNumber = (double) 93 + 98.8;
        System.out.println(doubleNumber);

        System.out.println("-----------");

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b);
        System.out.println("-----------");

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);
        System.out.println("-----------");

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);
        System.out.println("-----------");

    }
}
