package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Before
	@Given("^I have a search field on amazon page$")
	public void beforeScenario() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I search for a product with name \"([^\"]*)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^Product with name \"([^\"]*)\" should be displayed$")
	public void product_with_name_should_be_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");

	}
}
