package week02.collection;

import java.util.Stack;

public class Cal03 {
    public static void main(String[] args) {
        // Stack
        // 수직으로 값으로 쌓고 FILO(basket)
        // push, peek, pop
        // 최근 데이터 나열 혹은 중복 처리 막고 싶을 때
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while(!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
