package week03.homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());

        System.out.println(calculator.calculate(10, 20));

        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(20, 10));
    }
}
