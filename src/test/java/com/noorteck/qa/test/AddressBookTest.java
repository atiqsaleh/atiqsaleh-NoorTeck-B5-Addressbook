package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "http://a.testaddressbook.com/";
		CommonUI commonUIObj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		AddressBookTest testObj = new AddressBookTest();
		commonUIObj.openBrowser("chrome");
		commonUIObj.navigate(url);
		testObj.AddressBookTestOne();
		commonUIObj.quitBrowser();
	}
	public void AddressBookTestOne() {
		addressesObj.enterFirstName("Samer");
		addressesObj.enterlastName("Saleh");
		addressesObj.enterFirstAddress("Cown BLVD");
		addressesObj.enterSeconAddress("2906 Laffaytee BLVD");
		addressesObj.enterCityAddress("Fredericksburg");
		addressesObj.enterStateAddress("state", "VA");
		addressesObj.ageTextBox("22");
		addressesObj.enterPhoneNumber("123-2334-3434");
		addressesObj.clickRideoBatton();
		addressesObj.enterNoteTextField("Automation is Fun");
		addressesObj.clickNewAddressButton();
		addressesObj.clickListButton();
		
		
	}
		public void HomePageTestTwo() {
		homePageObj.clickHomeButton();
		homePageObj.clickAddressButton();
		homePageObj.clickSignOutButton();
		homePageObj.enterText("Welcome to Address Book");
		}
		public void SigninPageTestThree() {
		signinObj.enterEmailAddress("samersaleh@gmail.com");
		signinObj.enterPasswordId("samer12345");
		signinObj.clickSigninButton();
		}
		public void SignupPageTestFour() {
		signupObj.enterEmailAddress("silimansaleh@gmail.com");
		signupObj.enterpasswordId("siliman123");
		signupObj.clickSignup();
	}
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

