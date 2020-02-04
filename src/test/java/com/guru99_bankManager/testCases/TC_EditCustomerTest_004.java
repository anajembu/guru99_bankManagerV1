package com.guru99_bankManager.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99_bankManager.pageObjects.EditCustomerPage;
import com.guru99_bankManager.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass
{
	@Test
	public void editNewCustomer() throws InterruptedException, IOException 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("User name is provided");
		loginPage.setPassword(password);
		logger.info("Passsword is provided");
		loginPage.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editCustomerPage = new EditCustomerPage(driver);
		editCustomerPage.clickEditCustomer();
		logger.info("providing customer ID....");
		editCustomerPage.enterCustomerID(31047);
		editCustomerPage.clickSubmit1();
		
		Thread.sleep(3000);
		
		logger.info("providing customer details....");		
		editCustomerPage.enterCustomerAddress("NorthEast England");
		editCustomerPage.enterCustomerCity("Liverpool");
		editCustomerPage.enterCustomerState("Tyne and Wear");
		editCustomerPage.enterCustomerPinNumber(3207773);
		editCustomerPage.enterCustomerPhone("07451262687");
		
		String email=randomestring()+"@gmail.com";
		editCustomerPage.enterCustomerEmail(email);
		editCustomerPage.clickSubmit2();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean result=driver.getPageSource().contains("Customer details updated Successfully!!!");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"EditCustomer");
			Assert.assertTrue(false);
		}
	}

}
