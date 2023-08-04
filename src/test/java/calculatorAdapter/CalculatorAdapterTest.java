package calculatorAdapter;

import calculator.CalculatorAdapter;
import calculator.OperationNotSupportedError;
import calculator.UserCalculatorInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CalculatorAdapterTest {
    private UserCalculatorInterface calculator;
    private int value1;
    private int value2;
    private char operation;
    private int result;

    @Before
    public void before() {
        calculator = new CalculatorAdapter();
    }

    @Given("^Two input numbers, (\\d+) and (\\d+), and the operation (\\S)$")
    public void twoInputNumbersAndAndTheOperation(int arg0, int arg1, char operation) {
        this.value1 = arg0;
        this.value2 = arg1;
        this.operation = operation;
    }

    @Then("^I expect the result of calculation (\\d+)$")
    public void iExpectTheResultOfCalculation(int arg0) {
        try {
            result = calculator.calculate(value1, value2, operation);
            Assert.assertEquals(arg0, result);
        } catch (OperationNotSupportedError e) {
            Assert.fail("Error on not supported error");
        }
    }

    @Then("^I expect error$")
    public void iExpectError() {
        try {
            result = calculator.calculate(value1, value2, operation);
            Assert.fail("Not raising error on unsupported operation " + this.operation);
        } catch (OperationNotSupportedError e) {
            System.out.println("correct error on operation " + this.operation);
        }
    }
}
