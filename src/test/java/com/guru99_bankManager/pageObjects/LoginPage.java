package com.guru99_bankManager.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver localDriver;
	
	public LoginPage(WebDriver remoteDriver)
	{
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	@FindBy(name="uid") @CacheLookup WebElement txtUserName;
	@FindBy(name="password") @CacheLookup WebElement txtPassword;
	@FindBy(name="btnLogin") @CacheLookup WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a") @CacheLookup WebElement lnkLogout;
	
	public void setUserName(String userName) 
	{
		txtUserName.sendKeys(userName);
	}
	
	public void setPassword(String password) 
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit() 
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
