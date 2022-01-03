package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SigninPage;
import com.noorteck.qa.pages.SignupPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		signinObj = new SigninPage();
		signupObj = new SignupPage();
		homePageObj = new HomePage();
		addressesObj = new AddressesPage();
	}

}
