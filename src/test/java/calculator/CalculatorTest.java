package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorTest {
    private CalculatorInterface calculator;
    private int value1;
    private int value2;
    private Method method;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        try {
            method = this.calculator.getClass().getDeclaredMethod("add", int.class, int.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Not found the expected method");
        }
    }

    @When("^the (\\S+) is requested$")
    public void theOperationIsRequested(String func) {
        try {
            method = this.calculator.getClass().getDeclaredMethod(func, int.class, int.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Not found the expected method");
        }
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResultResult(int expected) {
        int result;
        try {
            result = (int) method.invoke(this.calculator, value1, value2);
        } catch (IllegalAccessException e) {
            Assert.fail("Not public visibility to service");
            return;
        } catch (InvocationTargetException e) {
            Assert.fail("Exception on invocation target");
            return;
        }
        Assert.assertEquals(expected, result);
    }
}
