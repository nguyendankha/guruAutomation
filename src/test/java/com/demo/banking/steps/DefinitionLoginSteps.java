package com.demo.banking.steps;

import com.demo.banking.steps.serenity.EndUserLoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionLoginSteps {
	@Steps
	EndUserLoginSteps KhaNguyen;

	@Given("I am on Login page")
	public void i_am_on_Login_page(){
		KhaNguyen.is_on_login_page();
	}

	@When("I enter my User ID as '(.*)'")
	public void i_enter_my_User_ID_as(String userID){
		KhaNguyen.enter_user_id(userID);
	}

	@When("I enter my Password as '(.*)'")
	public void i_enter_my_Password_as(String userPassword){
		KhaNguyen.enter_password(userPassword);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button(){
		KhaNguyen.click_login_button();
	}

	@Then("I navigate to Manager Homepage with Welcome text '(.*)'")
	public void i_navigate_to_Manager_Homepage_with_Welcome_text(String welcomeText){
	    welcomeText = KhaNguyen.get_welcome_text();
	}
	
	@Given("^I am on Manager Homepage$")
	public void i_am_on_Manager_Homepage(){
	    KhaNguyen.is_on_manager_home_page();
	}


	@When("^I click on New Customer menu$")
	public void i_click_on_New_Customer_menu(){
	    KhaNguyen.click_new_customer_menu();
	}

	@Then("^I navigate to New Customer page$")
	public void i_navigate_to_New_Customer_page(){
	    KhaNguyen.is_on_new_customer_page();
	}
}
