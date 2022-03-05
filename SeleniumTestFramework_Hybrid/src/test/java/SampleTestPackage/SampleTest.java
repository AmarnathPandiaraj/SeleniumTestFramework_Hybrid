package SampleTestPackage;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LogInPageEvents;
import pageObjects.LogInPageElements;

public class SampleTest extends BaseTest{
	
	@Test
	public void sampleMethodforEmailEntering() {
		//HomePageEvents homePageEvents = new HomePageEvents();
		//homePageEvents.clickOnSignInButton();
		
		LogInPageEvents logInPageEvents = new LogInPageEvents();
		logInPageEvents.enterEmailID();
		logInPageEvents.enterPassword();
		logInPageEvents.clickOnLogInInButton();
	}

}
