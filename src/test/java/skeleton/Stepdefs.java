package skeleton;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Is;

public class Stepdefs {

	@Given("I login with userid as (.*?) and password as (.*?).$")
	public void login(String userId, String password) {
		System.out.println("Step: Login ---User id is: " + userId + ", Password is: " + password);
	}
	
	@When("I am redirected to Home page")
	public void verifyHomePageRedirect() {
		System.out.println("Step: I am redirected to Home page");
	}
	
	@Then("I see my image and Logout button.")
	public void verifyUserImageAndLogoutButton() {
		System.out.println("Step: I am redirected to Home page");
		Assert.assertEquals("a", "b");
	}
}
