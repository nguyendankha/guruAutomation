package com.demo.banking.steps;

import com.demo.banking.steps.serenity.EndUserLoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionLoginSteps{
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
	
	@When("I enter Customer Name as '(.*)'")
	public void i_enter_Customer_Name_as(String name){
	    KhaNguyen.enter_customer_name(name);
	    
	}

	@When("I select Customer Gender as '(.*)'")
	public void i_select_Customer_Gender_as(String gender){
	    KhaNguyen.select_customer_gender(gender);
	    
	}

	@When("I enter Customer DOB as '(.*)' and '(.*)'")
	public void i_enter_Customer_DOB_as(String dob, String year){
	    KhaNguyen.enter_customer_dob(dob, year);
	    
	}

	@When("I enter Customer Address as '(.*)'")
	public void i_enter_Customer_Address_as(String address){
	    KhaNguyen.enter_customer_address(address);
	    
	}

	@When("I enter Customer City as '(.*)'")
	public void i_enter_Customer_City_as(String city){
	    KhaNguyen.enter_customer_city(city);
	    
	}

	@When("I enter Customer State as '(.*)'")
	public void i_enter_Customer_State_as(String state){
	    KhaNguyen.enter_customer_state(state);
	    
	}

	@When("I enter Customer PIN as '(.*)'")
	public void i_enter_Customer_PIN_as(String pin){
	    KhaNguyen.enter_customer_pin(pin);
	    
	}

	@When("I enter Customer Mobile number as '(.*)'")
	public void i_enter_Customer_Mobile_number_as(String phone){
	    KhaNguyen.enter_customer_phone(phone);
	    
	}

	@When("I enter Customer Email as '(.*)'")
	public void i_enter_Customer_Email_as(String email){
	    KhaNguyen.enter_customer_email(email);
	    
	}

	@When("I enter Customer Password as '(.*)'")
	public void i_enter_Customer_Password_as(String password){
	    KhaNguyen.enter_customer_password(password);
	    
	}
	
	@When("I click on Submit Register Account button")
	public void i_click_on_Submit_Register_Account_button() {
		KhaNguyen.click_submit_button();
	}

	@Then("I should see Registered Customer page with text '(.*)'")
	public void i_should_see_Registered_Customer_page_with_text(String registeredSuccess) throws Exception {
	    KhaNguyen.is_on_registered_customer_page(registeredSuccess);
	    System.out.println("Create customer successfully " + KhaNguyen.get_customer_id_after_registered());
	    KhaNguyen.set_customer_information_to_file();
	}
	
	@Given("^I click on New Account menu$")
	public void i_click_on_New_Account_menu(){
	    KhaNguyen.click_on_new_account_menu();
	}


	@Then("^I navigate to New Account page$")
	public void i_navigate_to_New_Account_page(){
		KhaNguyen.is_on_create_account_page();
	    KhaNguyen.use_created_customer_for_create_account();
	}
	
	@When("^I enter customer ID as'(.*)'$")
	public void i_enter_customer_ID_as(String customerID){
		KhaNguyen.enter_customer_id_on_create_account_page(customerID);
	}

	@When("^I click on Create Account button on Create Account page$")
	public void i_click_on_Create_Account_button_on_Create_Account_page() {
	    KhaNguyen.click_submit_button_to_create_account();
	}

	@Then("^I navigate to Created Account Page$")
	public void i_navigate_to_Created_Account_Page() throws InterruptedException {
	    Thread.sleep(5000);
	}
}
