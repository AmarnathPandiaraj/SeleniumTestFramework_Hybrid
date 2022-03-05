package utils;

import java.util.List;

import org.openqa.selenium.*;

import base.BaseTest;

public class ElementFetch {

	
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		case "LINK":
			return BaseTest.driver.findElement(By.id(identifierValue));
			default:
			return null;	
		}	
	}
	public List<WebElement> getListWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		case "LINK":
			return BaseTest.driver.findElements(By.id(identifierValue));
			default:
			return null;
		}
}
}