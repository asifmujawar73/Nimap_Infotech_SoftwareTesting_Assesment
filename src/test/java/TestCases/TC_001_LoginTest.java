package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import TestBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {

	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);

		// Perform login
		loginPage.enterEmail("siddiqshaikh1@nimapinfotech.com");
		loginPage.enterPassword("admin@123");
		loginPage.clickLoginButton();
		// Verify if the "Punched In" message is displayed
		boolean isMessageDisplayed = loginPage.isPunchedInMessageDisplayed();

		// Assertion
		Assert.assertTrue(isMessageDisplayed, "'Punched In' message is not displayed after login!");
		Thread.sleep(5000);
		// Proceed to add a customer
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
		addCustomerPage.customerDashboard(); 
		addCustomerPage.AddNewCustomer(); 
		addCustomerPage.enterCustomerName("Sanket Katare"); 
		addCustomerPage.saveCustomer();
	}

}
