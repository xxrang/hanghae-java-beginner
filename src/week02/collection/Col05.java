package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col05 {
    public static void main(String[] args) {
        // Set(집합) : 순서없고 중복 없음
        // 순서가 보장되지 않지만 중복 허용 하지 않음
        // HashSet, TreeSet 등
        // Set 생성자가 없는 인터페이스

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet) {
            System.out.println(value);
        }

        // contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
