package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        int[] intArr = new int[3]; // {0, 0, 0}
        boolean[] boolArr = new boolean[3]; // {false, false, false}
        String[] strArr = new String[3]; // {'', '', ''}

        int[] newIntArr;
        newIntArr = new int[3];

        //배열 순회
//        System.out.println(intArr[0]);

        for (int i=0; i<intArr.length; i++) {
            System.out.println(intArr[i]);
        }

    }
}
