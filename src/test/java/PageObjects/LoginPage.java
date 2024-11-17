package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@id='kt_login_signin_submit']")
	WebElement loginButton;

	@FindBy(xpath = "//div[@class='toast-message']") // Update the XPath as per the actual toast message element
	WebElement toastMessage;

	@FindBy(xpath = "//span[normalize-space()='72']") // XPath for "Punched In" message
	WebElement punchedInMessage;

	public void enterEmail(String emailId) {
		usernameField.sendKeys(emailId);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(10000);
		loginButton.click();
	}

//	// Method to get the toast message after login
//	public String getToastMessage() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement toast = wait.until(ExpectedConditions.visibilityOf(toastMessage));
//		return toast.getText();
//	}

	// Method to verify if the "Punched In" message is displayed
	public boolean isPunchedInMessageDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(punchedInMessage)).isDisplayed();
	}
}
