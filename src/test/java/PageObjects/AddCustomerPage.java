package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='My Customers']")
	WebElement myCustomer;

	@FindBy(xpath = "//span[normalize-space()='New Customer']")
	WebElement addNewCustomer;

	@FindBy(xpath = "//input[contains(@data-placeholder, 'Lead/Customer Name')]")
	WebElement customerName;
	
	@FindBy(xpath="(//span[normalize-space()='Save'])[1]")
	WebElement clickTOSave;

	public void customerDashboard() {
		myCustomer.click();
	}

	public void AddNewCustomer() {
		addNewCustomer.click();
	}
	public void enterCustomerName(String name) {
		customerName.sendKeys(name);
	}
	public void saveCustomer() {
		clickTOSave.click();
	}
}
