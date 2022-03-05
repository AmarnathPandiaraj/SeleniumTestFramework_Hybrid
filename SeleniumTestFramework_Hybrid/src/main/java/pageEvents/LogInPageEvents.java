package pageEvents;

import org.testng.Assert;

import pageObjects.LogInPageElements;
import utils.ElementFetch;

public class LogInPageEvents extends LogInPageElements{

	/*public void verifyLoginPageOpen() {
		ElementFetch elementFetch = new ElementFetch();
		Assert.assertTrue(elementFetch.getListWebElement("XPATH",signInText).size()>0, "Login page did not open");
	}*/
	public void enterEmailID() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", userField).sendKeys("standard_user");
	}
	public void enterPassword() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", passwordField).sendKeys("secret_sauce");
	}
	public void clickOnLogInInButton() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", logInButton).click();
	}
}
