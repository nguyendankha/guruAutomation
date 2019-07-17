package com.demo.banking.steps;

import com.demo.banking.steps.serenity.EndUserRegisterEmailSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionRegisterSteps {
	@Steps
	EndUserRegisterEmailSteps KhaNguyen;

	@Given("I open the Demo Homepage")
	public void givenIOpenTheDemoHomepage() {
		KhaNguyen.is_on_the_demo_home_page();
	}

	@When("I enter my email address '(.*)'")
	public void whenTheUserLooksUpTheDefinitionOf(String email) {
		KhaNguyen.enter_email(email);
	}
	
	@When("I click on Submit button")
	public void whenIClickOnSubmitButton() {
		KhaNguyen.click_submit_button();
	}

	@Then("I get the User ID '(.*)'")
	public void thenIGetTheUserID(String userID) {
		userID = KhaNguyen.get_user_ID();
	}
	
	@Then("I get the User Password '(.*)'")
	public void thenIGetTheUserPassword(String userPassword) {
		userPassword = KhaNguyen.get_user_Password();
	}
	
	
}
