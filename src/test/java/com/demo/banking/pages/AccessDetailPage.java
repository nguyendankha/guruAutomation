package com.demo.banking.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccessDetailPage extends PageObject{
	@FindBy(css = "tbody tr:nth-of-type(4) td:nth-of-type(2)")
	private WebElementFacade USER_ID_TEXT;
	
	@FindBy(css = "tbody tr:nth-of-type(5) td:nth-of-type(2)")
	private WebElementFacade PASSWORD_TEXT;
	
	public String getUserID() {
		String userID = USER_ID_TEXT.getText();
		return userID;
	}
	
	public String getUserPassword() {
		String userPassword = PASSWORD_TEXT.getText();
		return userPassword;
	}

}
