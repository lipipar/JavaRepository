package StepDefinitions;
import io.cucumber.java.en.*;
import static org.junit.Assert.*; 
import StepDefinitions.Calculator;


public class CalculatorSteps {
	Calculator cal = new Calculator();
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    assertNotNull(cal);
	}

	
	@When("I have provided {int} and {int} as the inputs")
	public void i_have_provided_and_as_the_inputs(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		cal.add(int1, int2);
		System.out.println("Adding");
	}

	
	@Then("the result should be {int}")
	public void the_result_should_be(int int1) {
	    // Write code here that turns the phrase above into concrete actions
		int res = cal.getResult();
	  assertEquals(int1, res);
	  System.out.println(res);

	}



}
