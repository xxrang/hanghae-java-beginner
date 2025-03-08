package week02.array;

public class Arr03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a;

        b[0] = 3;

        System.out.println(a[0]);
    }
}
