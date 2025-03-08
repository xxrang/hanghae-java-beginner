package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 0};

        int max = arr[0];
        int min = arr[0];

        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("최대값 -> " + max);
        System.out.println("최소값 -> " + min);
    }
}
