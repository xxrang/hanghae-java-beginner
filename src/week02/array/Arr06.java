package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; i< arr[i].length; i++) {
                System.out.println("i ->" + i);
                System.out.println("j ->" + j);
                arr[i][j] = 0;
            }
        }
    }
}
