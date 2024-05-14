package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	// 1. By Locators

	private By logginInMessage = By.xpath("//p[contains(text(),'You are')]");
	
	

	// 2. Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	// 3. Page Actions/Methods
	
	public String getHomePageTitle() {
		
		return driver.getTitle();
	}

	public String verifyLoggedInMessage() {

		String text = driver.findElement(logginInMessage).getText();
		return text;

	}
	
	

	

}
