package com.demo.banking.steps.serenity;

import com.demo.banking.objects.User;
import com.demo.banking.pages.AccessDetailPage;
import com.demo.banking.pages.DemoHomepage;

import net.thucydides.core.annotations.Step;

public class EndUserRegisterEmailSteps {
	DemoHomepage demoHomepage;
	AccessDetailPage accessDetailPage;
	User user;
	
	@Step
	public void is_on_the_demo_home_page() {
		demoHomepage.open();
	}
	
	@Step
	public void enter_email(String email) {
		demoHomepage.enter_email(email);
	}
	
	@Step
	public void click_submit_button() {
		demoHomepage.registerEmail();
	}
	
	@Step
	public String get_user_ID() {
		System.out.println("User ID: " + accessDetailPage.getUserID());
		User.setUserID(accessDetailPage.getUserID());
		return User.getUserID();
	}
	
	@Step
	public String get_user_Password() {
		System.out.println("User Password: " + accessDetailPage.getUserPassword());
		User.setUserPassword(accessDetailPage.getUserPassword());
		return User.getUserPassword();
		
	}
}
