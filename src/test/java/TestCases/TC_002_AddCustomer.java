package TestCases;

import org.testng.annotations.Test;

import PageObjects.AddCustomerPage;
import TestBase.BaseClass;
@Test
public class TC_002_AddCustomer extends BaseClass {
	public void testAddCustomer() {
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
		addCustomerPage.enterCustomerName("Sanket Katare");

	}
}
