package com.demo.banking.steps.serenity;

import com.demo.banking.objects.User;
import com.demo.banking.pages.GuruBankingLoginPage;
import com.demo.banking.pages.GuruManagerHomepage;
import com.demo.banking.pages.GuruNewCustomerPage;

import net.thucydides.core.annotations.Step;

public class EndUserLoginSteps {
	GuruBankingLoginPage guruBankingLoginPage;
	GuruManagerHomepage guruManagerHomepage;
	GuruNewCustomerPage guruNewCustomerPage;
	
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

}
