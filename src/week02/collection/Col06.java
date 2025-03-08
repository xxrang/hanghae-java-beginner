package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    public static void main(String[] args) {
        // Map: key - value pair
        // Key 값으로 Unique하게 보장되어야 함
        // HashMap, TreeMap

        Map<String, Integer> intMap = new HashMap<>();

        //키 값
        intMap.put("첫번째" ,1);
        intMap.put("두번째" ,2);
        intMap.put("세번째" ,3);
        intMap.put("네번째" ,4);
        intMap.put("첫번째" ,5);

        for (String key: intMap.keySet()) {
            System.out.println(key);
        }

        for (Integer key: intMap.values()) {
            System.out.println(key);
            // 마지막으로 입력한 key 값으로 조회됨
        }

        System.out.println(intMap.get("첫번째"));
    }
}
