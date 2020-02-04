package com.guru99_bankManager.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99_bankManager.pageObjects.DeleteCustomerPage;
import com.guru99_bankManager.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass
{
	@Test
	public void deleteCustomer() throws InterruptedException, IOException 
	{
	LoginPage loginPage = new LoginPage(driver);
	loginPage.setUserName(username);
	logger.info("User name is provided");
	loginPage.setPassword(password);
	logger.info("Passsword is provided");
	loginPage.clickSubmit();
	
	Thread.sleep(3000);
	
	DeleteCustomerPage deleteCustomerPage = new DeleteCustomerPage(driver);
	deleteCustomerPage.clickDeleteCustomer();
	logger.info("providing customer ID....");
	deleteCustomerPage.enterCustomerID(31047);
	deleteCustomerPage.clickSubmit1();
	
	Thread.sleep(3000);
	
	
	if(isAlertPresent()==true)
	{
		Assert.assertTrue(true);
		driver.switchTo().alert().accept();//close alert		
		logger.info("Customer deleted");
	}
	else
	{
		Assert.assertTrue(false);
		logger.warn("Could not delete customer");
		
	}
	
	}

}
