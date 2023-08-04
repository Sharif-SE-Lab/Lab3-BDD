package calculator;

public class Calculator implements CalculatorInterface{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}