package com.guru99_bankManager.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.guru99_bankManager.testCases.BaseClass;

public class EditCustomerPage 
{
	WebDriver localDriver;
	public EditCustomerPage(WebDriver remoteDriver) 
	{
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[3]/a") @CacheLookup WebElement linkEditCustomer;
	@FindBy(how = How.NAME, using = "cusid") @CacheLookup WebElement txtCustomerID;
	@FindBy(how = How.NAME, using = "AccSubmit") @CacheLookup WebElement btnSubmit1;
	@FindBy(how = How.NAME, using = "res") @CacheLookup WebElement btnReset;
	
	//Details too Edit Elements

	@FindBy(how = How.NAME, using = "addr") @CacheLookup WebElement txtAddress;
	@FindBy(how = How.NAME, using = "city") @CacheLookup WebElement txtCity;
	@FindBy(how = How.NAME, using = "state") @CacheLookup WebElement txtState;
	@FindBy(how = How.NAME, using = "pinno") @CacheLookup WebElement txtPinNumber;
	@FindBy(how = How.NAME, using = "telephoneno") @CacheLookup WebElement txtPhone;
	@FindBy(how = How.NAME, using = "emailid") @CacheLookup WebElement txtEmail;

	@FindBy(how = How.NAME, using = "sub") @CacheLookup WebElement btnSubmit2;
	
	
	public void clickEditCustomer() throws InterruptedException 
	{
		BaseClass baseClass = new BaseClass();
		baseClass.overrideToLocateElement(linkEditCustomer);
	}
	
	public void enterCustomerID(int customerID) 
	{
		txtCustomerID.sendKeys(String.valueOf(customerID));
	}
	public void clickSubmit1() 
	{
		btnSubmit1.click();	
	}
	public void clickReset() 
	{
		btnReset.click();	
	}
	
	//Details to edit actions
	
	public void enterCustomerAddress(String customerAddress) 
	{
		txtAddress.clear();
		txtAddress.sendKeys(customerAddress);
	}
	
	public void enterCustomerCity(String customerCity) 
	{
		txtCity.clear();
		txtCity.sendKeys(customerCity);
	}
	
	public void enterCustomerState(String customerState) 
	{
		txtState.clear();
		txtState.sendKeys(customerState);
	}
	
	public void enterCustomerPinNumber(int customerPin) 
	{
		txtPinNumber.clear();
		txtPinNumber.sendKeys(String.valueOf(customerPin));
	}
	
	public void enterCustomerPhone(String customerPhone) 
	{
		txtPhone.clear();
		txtPhone.sendKeys(customerPhone);
	}
	
	public void enterCustomerEmail(String customerEmail) 
	{
		txtEmail.clear();
		txtEmail.sendKeys(customerEmail);
	}
	
	public void clickSubmit2() 
	{
		btnSubmit2.click();	
	}
}
