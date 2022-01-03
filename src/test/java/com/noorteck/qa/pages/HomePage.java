package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	    @FindBy(css = ".nav-item.nav-link.active")
    	WebElement homePage;
	
		@FindBy(xpath = "//*[@data-test= 'addresses']")
		WebElement addressField;
		

		@FindBy(xpath = "//a[text()='Sign out']")
		WebElement signoutField;
		
		@FindBy(xpath = "//h1[text()='Welcome to Address Book']")
		WebElement textField;
		
	
	
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		public void clickHomeButton() {
			click(homePage);
		}
		public void clickAddressButton() {
		 click(addressField);
		
}	
		public void clickSignOutButton() {
			click(signoutField);
			
}
		public void enterText(String text) {
		enter(textField, text);
			
		
}
}
