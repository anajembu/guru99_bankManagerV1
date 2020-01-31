package com.guru99_bankManager.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99_bankManager.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);
		logger.info("url opened");
		
		LoginPage loginPage  = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("username entered");
		loginPage.setPassword(password);
		logger.info("Password entered");
		loginPage.clickSubmit();
		logger.info("Login button clicked");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("TC_LoginTest_001 Passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("TC_LoginTest_001 Failed");
		}
	}
}
