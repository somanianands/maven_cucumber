package com.app.google.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^I go to \"([^\"]*)\"$")
	public void I_go_to(String arg1) {
		System.out.println("I go to " + arg1);
	}

	@Given("^I enter username as \"([^\"]*)\"$")
	public void I_enter_username_as(String arg1) throws Throwable {
		System.out.println("I enter username as " + arg1);
	}

	@Given("^I enter password as \"([^\"]*)\"$")
	public void I_enter_password_as(String arg1) throws Throwable {
		System.out.println("I enter password as " + arg1);
	}

	@When("^I click on Login button$")
	public void I_click_on_Login_button() throws Throwable {
		System.out.println("I click on Login button");
	}

	@Then("^I should get error message$")
	public void I_should_get_message() throws Throwable {
		System.out.println("I should get error message");
	}

}
