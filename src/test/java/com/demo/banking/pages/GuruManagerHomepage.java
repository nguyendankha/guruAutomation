package com.demo.banking.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GuruManagerHomepage extends PageObject{
	@FindBy(xpath = "//marquee[@class='heading3']")
	private WebElementFacade WELCOME_TEXT;
	
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	private WebElementFacade NEW_CUSTOMER_MENU;
	
	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	private WebElementFacade NEW_ACCOUNT_MENU;
	
	public String get_welcome_text() {
		return WELCOME_TEXT.getText();
	}
	
	public void is_on_manager_home_page() {
		WELCOME_TEXT.isDisplayed();
	}
	
	public void click_new_customer_menu() {
		NEW_CUSTOMER_MENU.click();
	}
	
	public void click_new_account_menu() {
		NEW_ACCOUNT_MENU.click();
	}
}
