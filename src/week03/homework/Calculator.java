package week03.homework;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNum, int secondNum) {
        double result = 0;
        result = operation.operate(firstNum, secondNum);
        return result;
    }
}
