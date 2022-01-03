package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SigninPage;
import com.noorteck.qa.pages.SignupPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
	
	public  SigninPage signinObj;
	public SignupPage signupObj;
	public HomePage homePageObj;
	public AddressesPage addressesObj;
	
}
