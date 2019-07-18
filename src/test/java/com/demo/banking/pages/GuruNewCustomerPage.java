package com.demo.banking.pages;

import com.demo.banking.objects.Customers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GuruNewCustomerPage extends PageObject{
	Customers customers;
	
	public GuruNewCustomerPage() {
		customers = new Customers();
		customers.createCustomerInformation();
	}
	
	@FindBy(xpath = "//p[@class='heading3']")
	private WebElementFacade ADD_NEW_CUSTOMER_PAGE_HEADING;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElementFacade CUSTOMER_NAME;
	
	@FindBy(xpath = "//input[@value='m']")
	private WebElementFacade CUSTOMER_GENDER_MALE;
	
	@FindBy(xpath = "//input[@value='f']")
	private WebElementFacade CUSTOMER_GENDER_FEMALE;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	private WebElementFacade CUSTOMER_ADDRESS;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElementFacade CUSTOMER_CITY;
	
	@FindBy(xpath = "//input[@name='state']")
	private WebElementFacade CUSTOMER_STATE;
	
	@FindBy(xpath = "//input[@id='dob']")
	private WebElementFacade CUSTOMER_DOB;
	
	@FindBy(xpath = "//input[@name='pinno']")
	private WebElementFacade CUSTOMER_PIN;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	private WebElementFacade CUSTOMER_MOBILE_NUMBER;
	
	@FindBy(xpath = "//input[@name='emailid']")
	private WebElementFacade CUSTOMER_EMAIL;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElementFacade CUSTOMER_PASSWORD;
	
	@FindBy(xpath = "//input[@name='sub']")
	private WebElementFacade CUSTOMER_SUBMIT_BUTTON;
	
	public void is_on_new_customer_page() {
		ADD_NEW_CUSTOMER_PAGE_HEADING.isCurrentlyVisible();
	}
	
	public void enter_customer_name(String name) {
		name = customers.getCustomerName();
		CUSTOMER_NAME.click();
		CUSTOMER_NAME.clear();
		CUSTOMER_NAME.type(name);
	}
	
	public void select_customer_gender(String gender) {
		gender = customers.getGender();
		if (gender.equals("male")) {
			CUSTOMER_GENDER_MALE.click();
		} else if(gender.equals("female")){
			CUSTOMER_GENDER_FEMALE.click();
		} else {
			System.out.println("Gender is error.");
		}
	}
	
	public void enter_customer_dob(String dob) {
		dob = customers.getDateOfBirth();
		CUSTOMER_DOB.click();
		CUSTOMER_DOB.type(dob);
	}
	
	public void enter_customer_address(String address) {
		address = customers.getAddress();
		CUSTOMER_ADDRESS.click();
		CUSTOMER_ADDRESS.clear();
		CUSTOMER_ADDRESS.type(address);
	}
	
	public void enter_customer_city(String city) {
		city = customers.getCity();
		CUSTOMER_CITY.click();
		CUSTOMER_CITY.clear();
		CUSTOMER_CITY.type(city);
	}
	
	public void enter_customer_state(String state) {
		state = customers.getState();
		CUSTOMER_STATE.click();
		CUSTOMER_STATE.clear();
		CUSTOMER_STATE.type(state);
	}
	
	public void enter_customer_mobile_phone(String phone) {
		phone = customers.getMobileNumber();
		CUSTOMER_MOBILE_NUMBER.click();
		CUSTOMER_MOBILE_NUMBER.clear();
		CUSTOMER_MOBILE_NUMBER.type(phone);
	}
	
	public void enter_customer_pin(String pin) {
		pin = customers.getPin();
		CUSTOMER_PIN.click();
		CUSTOMER_PIN.clear();
		CUSTOMER_PIN.type(pin);
	}
	
	public void enter_customer_email(String email) {
		email = customers.getEmail();
		CUSTOMER_EMAIL.click();
		CUSTOMER_EMAIL.clear();
		CUSTOMER_EMAIL.type(email);
	}
	
	public void enter_password(String password) {
		password = customers.getPassword();
		CUSTOMER_PASSWORD.click();
		CUSTOMER_PASSWORD.clear();
		CUSTOMER_PASSWORD.type(password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
