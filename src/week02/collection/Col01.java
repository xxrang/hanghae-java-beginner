package week02.collection;

import java.util.ArrayList;

public class Col01 {
    public static void main(String[] args) {
        // List 순서가 있는 집합 -> Array (길이 몰라도 만들 수 있음)
        // Array 정적배열
        // List 동적배열

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(99);
        intList.add(15);
        intList.add(3);

//        System.out.println(intList.get(1));

        intList.set(1, 10);
//        System.out.println(intList.get(1));

        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println(intList.toString());
        intList.clear();
        System.out.println(intList.toString());
    }
}
