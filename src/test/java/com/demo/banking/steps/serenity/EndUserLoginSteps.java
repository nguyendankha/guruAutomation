package com.demo.banking.steps.serenity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.demo.banking.objects.Account;
import com.demo.banking.objects.Customers;
import com.demo.banking.objects.User;
import com.demo.banking.pages.GuruBankingLoginPage;
import com.demo.banking.pages.GuruCustomerRegisteredPage;
import com.demo.banking.pages.GuruManagerHomepage;
import com.demo.banking.pages.GuruNewAccountPage;
import com.demo.banking.pages.GuruNewCustomerPage;
import net.thucydides.core.annotations.Step;

public class EndUserLoginSteps {
	GuruBankingLoginPage guruBankingLoginPage;
	GuruManagerHomepage guruManagerHomepage;
	GuruNewCustomerPage guruNewCustomerPage;
	GuruCustomerRegisteredPage guruCustomerRegisteredPage;
	GuruNewAccountPage guruNewAccountPage;
	Customers customers;
	Account account;
	Customers customersInfo = new Customers();

	public EndUserLoginSteps() {
		customers = new Customers();
		customers.createCustomerInformation();
	}

	@Step
	public void is_on_login_page() {
		guruBankingLoginPage.open();
	}

	@Step
	public void enter_user_id(String userID) {
		userID = User.getUserID();
		guruBankingLoginPage.enter_user_id(userID);
	}

	@Step
	public void enter_password(String userPassword) {
		userPassword = User.getUserPassword();
		guruBankingLoginPage.enter_user_password(userPassword);
	}

	@Step
	public void click_login_button() {
		guruBankingLoginPage.click_login_button();
	}

	@Step
	public String get_welcome_text() {
		return guruManagerHomepage.get_welcome_text();
	}

	@Step
	public void is_on_manager_home_page() {
		guruManagerHomepage.is_on_manager_home_page();
	}

	@Step
	public void click_new_customer_menu() {
		guruManagerHomepage.click_new_customer_menu();
	}

	@Step
	public void is_on_new_customer_page() {
		guruNewCustomerPage.is_on_new_customer_page();
	}

	@Step
	public void enter_customer_name(String name) {
		name = customers.getCustomerName();
		guruNewCustomerPage.enter_customer_name(name);
	}

	@Step
	public void select_customer_gender(String gender) {
		gender = customers.getGender();
		guruNewCustomerPage.select_customer_gender(gender);
	}

	@Step
	public void enter_customer_dob(String dob, String year) {
		dob = customers.getDateOfBirth();
		year = customers.getDobYear();
		guruNewCustomerPage.enter_customer_dob(dob, year);
	}

	@Step
	public void enter_customer_address(String address) {
		address = customers.getAddress();
		guruNewCustomerPage.enter_customer_address(address);
	}

	@Step
	public void enter_customer_city(String city) {
		city = customers.getCity();
		guruNewCustomerPage.enter_customer_city(city);
	}

	@Step
	public void enter_customer_state(String state) {
		state = customers.getState();
		guruNewCustomerPage.enter_customer_state(state);
	}

	@Step
	public void enter_customer_pin(String pin) {
		pin = customers.getPin();
		guruNewCustomerPage.enter_customer_pin(pin);
	}

	@Step
	public void enter_customer_phone(String phone) {
		phone = customers.getMobileNumber();
		guruNewCustomerPage.enter_customer_mobile_phone(phone);
	}

	@Step
	public void enter_customer_email(String email) {
		email = customers.getEmail();
		guruNewCustomerPage.enter_customer_email(email);
	}

	@Step
	public void enter_customer_password(String password) {
		password = customers.getPassword();
		guruNewCustomerPage.enter_password(password);
	}

	@Step
	public void click_submit_button() {
		guruNewCustomerPage.click_submit_button();
	}

	@Step
	public String is_on_registered_customer_page(String registeredSuccess) {
		return guruCustomerRegisteredPage.create_new_customer_successfully();
	}

	@Step
	public String get_customer_id_after_registered() {
		customers.setId(guruCustomerRegisteredPage.get_customer_id());
		String customerID = customers.getId();
		return customerID;
	}

	@Step
	public void set_customer_information_to_file() {
		ArrayList<Customers> customer = new ArrayList<>();
		System.out.println("Before write ID: " + customers.toString());
		customer.add(customers);
		try {
			FileOutputStream fos = new FileOutputStream(new File("customerData.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(customer);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	@Step
	public void is_on_create_account_page() {
		guruNewAccountPage.is_on_new_account_page();
	}

	@Step
	public void click_on_new_account_menu() {
		guruManagerHomepage.click_new_account_menu();
	}

	@Step
	public Customers use_created_customer_for_create_account() {
		ArrayList<Customers> customers = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(new File("customerData.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			customers = (ArrayList) ois.readObject();
			System.out.println("Array size: " + customers.size());
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}

		// Verify list data
		for (Customers customer : customers) {
			System.out.println("ID in create account page " + customer.getId());
			customer.toString();
		}
		customersInfo = customers.get(customers.size() - 1);
		System.out.println("After read: " + customersInfo.toString());
		return customersInfo;
	}

	@Step
	public void enter_customer_id_on_create_account_page(String customerID) {
		customerID = customersInfo.getId();
		guruNewAccountPage.enter_customer_id_in_create_account_page(customerID);
	}

	@Step
	public void click_submit_button_to_create_account() {
		guruNewAccountPage.click_submit_create_account_button();
	}

}
