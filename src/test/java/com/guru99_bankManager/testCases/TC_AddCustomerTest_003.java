package com.guru99_bankManager.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99_bankManager.pageObjects.AddCustomerPage;
import com.guru99_bankManager.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass 
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("User name is provided");
		loginPage.setPassword(password);
		logger.info("Passsword is provided");
		loginPage.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
		addCustomerPage.clickAddNewCustomer();
		logger.info("providing customer details....");
		
		addCustomerPage.enterCustomerName("Orji");
		addCustomerPage.selectCustomerGender("male");
		addCustomerPage.selectCustomerDOB("10","15","1985");
		Thread.sleep(5000);
		addCustomerPage.enterCustomerAddress("England");
		addCustomerPage.enterCustomerCity("Sunderland");
		addCustomerPage.enterCustomerState("Tyne and Wear");
		addCustomerPage.enterCustomerPinNumber(3207773);
		addCustomerPage.enterCustomerPhone("987890091");
		
		String email=randomestring()+"@gmail.com";
		addCustomerPage.enterCustomerEmail(email);
		addCustomerPage.enterCustomerPassword("abcd45e89f");
		addCustomerPage.clickSubmit();
		
		Thread.sleep(3000);
		
logger.info("validation started....");
		
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
}
