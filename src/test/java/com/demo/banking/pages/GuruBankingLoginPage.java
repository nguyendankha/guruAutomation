package com.demo.banking.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/v4/")
public class GuruBankingLoginPage extends PageObject {

	@FindBy(xpath = "//input[@name='uid']")
	private WebElementFacade USER_ID_TEXTBOX;

	@FindBy(xpath = "//input[@name='password']")
	private WebElementFacade USER_PASSWORD_TEXTBOX;

	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElementFacade LOGIN_BUTTON;

	public void enter_user_id(String userID) {
		USER_ID_TEXTBOX.click();
		USER_ID_TEXTBOX.clear();
		USER_ID_TEXTBOX.type(userID);
	}

	public void enter_user_password(String userPassword) {
		USER_PASSWORD_TEXTBOX.click();
		USER_PASSWORD_TEXTBOX.clear();
		USER_PASSWORD_TEXTBOX.type(userPassword);
	}

	public void click_login_button() {
		LOGIN_BUTTON.click();
	}
}
