package calculator;



public class CalculatorAdapter implements CalculatorInterface, UserCalculatorInterface{
    private final Calculator calculator;

    public CalculatorAdapter() {
        this.calculator = new Calculator();
    }

    public int calculate(int a, int b, char op) throws OperationNotSupportedError{
        switch(op) {
            case '+':
                return this.add(a, b);
            case '*':
                return this.mul(a, b);
            case '/':
                return this.div(a, b);
            case '^':
                return this.pow(a, b);
            default:
                throw new OperationNotSupportedError(op);
        }
    }

    @Override
    public int add(int a, int b) {
        return this.calculator.add(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return this.calculator.mul(a, b);
    }

    @Override
    public int div(int a, int b) {
        return this.calculator.div(a, b);
    }

    @Override
    public int pow(int a, int b) {
        return this.calculator.pow(a, b);
    }
}
