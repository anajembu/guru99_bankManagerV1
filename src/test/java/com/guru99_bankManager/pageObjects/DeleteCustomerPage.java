package com.guru99_bankManager.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.guru99_bankManager.testCases.BaseClass;

public class DeleteCustomerPage 
{
WebDriver localDriver;
	
	public DeleteCustomerPage(WebDriver remoteDriver) 
	{
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[4]/a") @CacheLookup WebElement linkDeleteCustomer;
	@FindBy(how = How.NAME, using = "cusid") @CacheLookup WebElement txtCustomerID;
	@FindBy(how = How.NAME, using = "AccSubmit") @CacheLookup WebElement btnSubmit1;
	@FindBy(how = How.NAME, using = "res") @CacheLookup WebElement btnReset;

	public void clickDeleteCustomer() throws InterruptedException 
	{
		BaseClass baseClass = new BaseClass();
		baseClass.overrideToLocateElement(linkDeleteCustomer);
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
	
	
}
