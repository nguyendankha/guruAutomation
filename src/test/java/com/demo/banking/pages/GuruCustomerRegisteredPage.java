package com.demo.banking.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GuruCustomerRegisteredPage extends PageObject {
	
	@FindBy(xpath = "//p[@class='heading3']")
	private WebElementFacade REGISTERED_SUCCESSFULLY;
	
	@FindBy(css = "table[id='customer'] tr:nth-of-type(4) td:nth-of-type(2)")
	private WebElementFacade CUSTOMER_ID;

	public String create_new_customer_successfully() {
		return REGISTERED_SUCCESSFULLY.getText();
	}
	
	public String get_customer_id() {
		String customerID = CUSTOMER_ID.getText();
		return customerID;
	}
}
