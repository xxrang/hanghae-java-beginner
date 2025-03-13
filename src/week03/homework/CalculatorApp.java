package week03.homework;

import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력");
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("연산자 입력");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자 입력");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }
}
