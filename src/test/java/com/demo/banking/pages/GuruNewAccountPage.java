package com.demo.banking.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GuruNewAccountPage extends PageObject{
	@FindBy(xpath = "//p[@class='heading3']")
	private WebElementFacade PAGE_HEADER;
	
	@FindBy(xpath = "//input[@name='cusid']")
	private WebElementFacade CUSTOMER_ID_TEXTBOX;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	private WebElementFacade ACCOUNT_TYPE_DROPDOWN;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	private WebElementFacade INIT_DEPOSIT_TEXTBOX;
	
	@FindBy(xpath = "//input[@name='button2']")
	private WebElementFacade SUBMIT_CREATE_ACCOUNT_BUTTON;
	
	public void enter_customer_id_in_create_account_page(String customerID) {
		CUSTOMER_ID_TEXTBOX.clear();
		CUSTOMER_ID_TEXTBOX.type(customerID);
	}
	
	public void select_saving_account_type() {
		ACCOUNT_TYPE_DROPDOWN.selectByValue("Savings");
	}
	
	public void enter_init_deposit_in_create_account_page(String initDeposit) {
		INIT_DEPOSIT_TEXTBOX.clear();
		INIT_DEPOSIT_TEXTBOX.type(initDeposit);
	}
	
	public void click_submit_create_account_button() {
		SUBMIT_CREATE_ACCOUNT_BUTTON.click();
	}
	
	public void is_on_new_account_page() {
		PAGE_HEADER.isDisplayed();
	}
	
}
