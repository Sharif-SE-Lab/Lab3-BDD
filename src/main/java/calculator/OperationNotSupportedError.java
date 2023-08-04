package calculator;

public class OperationNotSupportedError extends Exception {
    public OperationNotSupportedError(char op) {
        super("Operation " + op + " Not supported. Supported operations are: +, *, /, ^");
    }
}