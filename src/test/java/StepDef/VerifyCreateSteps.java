package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyCreateSteps {
	@Given("Create New Booking ID")
	public void create_new_booking_id() throws FileNotFoundException {
	   CreateAPI ref = new CreateAPI();
	   ref.CreateMethod();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
	    System.out.println("Executed Successfully");
	}

}
