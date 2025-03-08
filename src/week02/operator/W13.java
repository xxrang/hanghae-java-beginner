package week02.operator;

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 입력 : ");
        String aHand = sc.nextLine();

        System.out.println("B 입력 : ");
        String bHand = sc.nextLine();

        // 두 개의 값을 비교하는 메서드 Objects.equals(좌, 우) &&

        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("무승부");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B Win");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A Win");
            } else {
                System.out.println("A Non Value");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A Win");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("무승부");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B Win");
            } else {
                System.out.println("B Non Value");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B Win");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A Win");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("무승부");
            } else {
                System.out.println("B Non Value");
            }
        } else {
            System.out.println("A Non Value");
        }
    }
}
