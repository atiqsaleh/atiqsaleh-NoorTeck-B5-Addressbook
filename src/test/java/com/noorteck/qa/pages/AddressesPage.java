package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {
	@FindBy(css = ".row.justify-content-center")
	WebElement newAddress;

	@FindBy(css = "address_first_name")
	WebElement firstNameField;

	@FindBy(css = "address_last_name")
	WebElement lastNameField;

	@FindBy(css = "#address_street_address")
	WebElement AddressOneField;

	@FindBy(css = "#address_secondary_address")
	WebElement SecondAddressField;

	@FindBy(css = "#address_city")
	WebElement citydAddressField;

	@FindBy(css = "#address_state")
	WebElement stateDropdownField;

	@FindBy(css = "#address_zip_code")
	WebElement zipeCodeField;

	@FindBy(css = "//input[@value= 'us']")
	WebElement radioButtonField;

	@FindBy(css = "#address_age")
	WebElement ageBoxField;

	@FindBy(css = "#address_website")
	WebElement websiteAddressField;

	@FindBy(css = "#address_phone")
	WebElement phoneNumberField;

	@FindBy(css = "#address_interest_dance")
	WebElement danceCheckBoxFeild;

	@FindBy(css = "#address_note")
	WebElement textAreaField;

	@FindBy(xpath = "//*[@type= 'submit']")
	WebElement noteTextBoxField;

	@FindBy(css = ".alert.alert-notice")
	WebElement addresscreationField;

	@FindBy(xpath = "//a[text()='Edit']")
	WebElement editButtonField;

	@FindBy(xpath = "//a[text()='List']")
	WebElement listButtonField;

	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickNewAddressButton() {
		click(newAddress);
	}

	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterlastName(String lastName) {
		enter(lastNameField, lastName);

	}

	public void enterFirstAddress(String FirstaddressName) {
		enter(AddressOneField, FirstaddressName);
	}

	public void enterSeconAddress(String secondAddressName) {
		enter(SecondAddressField, secondAddressName);
	}

	public void enterCityAddress(String cityAddress) {
		enter(citydAddressField, cityAddress);
	}

	public void enterStateAddress(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropdownField, methodName, indexTextValue);
	}

	public void zipCodeAddress(String zipeCode) {
		enter(zipeCodeField, zipeCode);
	}

	public void clickRideoBatton() {
		click(radioButtonField);
	}

	public void ageTextBox(String age) {
		enter(ageBoxField, age);
	}

	public void enterWebsiteAddress(String Websitaddress) {
		enter(websiteAddressField, Websitaddress);
	}

	public void enterPhoneNumber(String PhoneNumber) {
		enter(phoneNumberField, PhoneNumber);
	}

	public void clickCheckboxButton() {
		click(danceCheckBoxFeild);
	}

	public void enterTextBox(String enterText) {
		enter(textAreaField, enterText);
	}

	public void enterNoteTextField(String enterNoteText) {
		enter(noteTextBoxField, enterNoteText);
	}

	public void enterAddressCreationField(String AddressCreation) {
		enter(addresscreationField, AddressCreation);
	}

	public void clicEditButton() {
		click(editButtonField);

	}

	public void clickListButton() {
		click(listButtonField);
	}
}
