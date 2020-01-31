package com.guru99_bankManager.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.guru99_bankManager.testCases.BaseClass;


//import com.guru99_bankManager.testCases.BaseClass;

public class AddCustomerPage 
{
	WebDriver localDriver;
	
	public AddCustomerPage(WebDriver remoteDriver) 
	{
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a") @CacheLookup WebElement linkAddNewCustomer;
	@FindBy(how = How.NAME, using = "name") @CacheLookup WebElement txtCustomerName;
	@FindBy(how = How.NAME, using = "rad1") @CacheLookup WebElement radiobtnGender;
	@FindBy(how = How.NAME, using = "dob") @CacheLookup WebElement txtDateOfBirth;
	@FindBy(how = How.NAME, using = "addr") @CacheLookup WebElement txtAddress;
	@FindBy(how = How.NAME, using = "city") @CacheLookup WebElement txtCity;
	@FindBy(how = How.NAME, using = "state") @CacheLookup WebElement txtState;
	@FindBy(how = How.NAME, using = "pinno") @CacheLookup WebElement txtPinNumber;
	@FindBy(how = How.NAME, using = "telephoneno") @CacheLookup WebElement txtPhone;
	@FindBy(how = How.NAME, using = "emailid") @CacheLookup WebElement txtEmail;
	@FindBy(how = How.NAME, using = "password") @CacheLookup WebElement txtPassword;
	@FindBy(how = How.NAME, using = "sub") @CacheLookup WebElement btnSubmit;
	
	public void clickAddNewCustomer() throws InterruptedException 
	{
		BaseClass baseClass = new BaseClass();
		baseClass.overrideToLocateElement(linkAddNewCustomer);
	}
	
	public void enterCustomerName(String customerName) 
	{
		txtCustomerName.sendKeys(customerName);
	}
	
	public void selectCustomerGender(String customerGender) 
	{
		radiobtnGender.sendKeys(customerGender);
	}
	
	public void selectCustomerDOB(String mm, String dd, String yy) 
	{
		txtDateOfBirth.sendKeys(mm);
		txtDateOfBirth.sendKeys(dd);
		txtDateOfBirth.sendKeys(yy);
	}
	
	public void enterCustomerAddress(String customerAddress) 
	{
		txtAddress.sendKeys(customerAddress);
	}
	
	public void enterCustomerCity(String customerCity) 
	{
		txtCity.sendKeys(customerCity);
	}
	
	public void enterCustomerState(String customerState) 
	{
		txtState.sendKeys(customerState);
	}
	
	public void enterCustomerPinNumber(int customerPin) 
	{
		txtPinNumber.sendKeys(String.valueOf(customerPin));
	}
	
	public void enterCustomerPhone(String customerPhone) 
	{
		txtPhone.sendKeys(customerPhone);
	}
	
	public void enterCustomerEmail(String customerEmail) 
	{
		txtEmail.sendKeys(customerEmail);
	}
	
	public void enterCustomerPassword(String customerPassword) 
	{
		txtPassword.sendKeys(customerPassword);
	}
	
	public void clickSubmit() 
	{
		btnSubmit.click();	
	}
}
