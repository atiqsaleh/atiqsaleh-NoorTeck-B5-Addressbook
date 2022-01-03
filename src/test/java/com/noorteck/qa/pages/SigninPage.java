package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SigninPage extends CommonUI {

@FindBy(xpath = "//*[@class= 'form-control']")
WebElement emailIdField;

@FindBy(xpath = "//*[@placeholder= 'Password']")
WebElement passwordField;


@FindBy(xpath = "//*[@value= 'Sign in']")
WebElement signinField;



public SigninPage() {
	PageFactory.initElements(driver, this);
}
public void enterEmailAddress(String email) {
	enter(emailIdField, email);
}
public void enterPasswordId(String password) {
	enter(passwordField, password);

}
public void clickSigninButton() {
	click(signinField);
	
}
	
	
}
