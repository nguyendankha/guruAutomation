package com.demo.banking.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/")
public class DemoHomepage extends PageObject{
	@FindBy(xpath = "//input[@name='emailid']")
    private WebElementFacade EMAIL_TEXTBOX;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElementFacade SUBMIT_BUTTON;

    public void enter_email(String email) {
    	EMAIL_TEXTBOX.click();
        EMAIL_TEXTBOX.clear();
        EMAIL_TEXTBOX.type(email);
    }

    public void registerEmail() {
        SUBMIT_BUTTON.click();
    }

}
