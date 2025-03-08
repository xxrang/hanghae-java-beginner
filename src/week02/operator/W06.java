package week02.operator;

public class W06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int value = ++a + --b;
//        int value = ++a + b--;

        System.out.println(a);
        System.out.println(b);
        System.out.println(value);
    }
}
