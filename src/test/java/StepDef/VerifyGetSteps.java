package StepDef;

import ApiUtils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetSteps {
	@Given("Calling Get Method")
	public void calling_get_method() {
	   CreateAPI ref = new CreateAPI();
	   ref.getMethod();
	}

	@Then("Executed Successfully")
	public void executed_successfully() {
	   System.out.println("Get Method Executed Successfully");
	}
}
