package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents extends HomePageElements{

	public void clickOnSignInButton() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", signInButton).click();
	}
	
	
}
