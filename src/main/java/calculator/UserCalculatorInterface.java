package calculator;


public interface UserCalculatorInterface {
    int calculate(int a, int b, char op) throws OperationNotSupportedError;
}