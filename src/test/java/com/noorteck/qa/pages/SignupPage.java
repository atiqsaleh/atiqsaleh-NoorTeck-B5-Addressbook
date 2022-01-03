package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignupPage extends CommonUI {
	

	@FindBy(xpath = "//*[@placeholder= 'Email']")
	WebElement emailIdField;

	@FindBy(css = "user_password")
	WebElement passwordField;

	@FindBy(xpath = "//*[@value= 'Sign up']")
	WebElement signupField1;

	public SignupPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmailAddress(String email) {
		enter(emailIdField, email);

	}

	public void enterpasswordId(String passwordId) {
		enter(passwordField, passwordId);

	}

	public void clickSignup() {
		click(signupField1);

	}
}
