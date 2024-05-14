package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators

	private By emailId = By.id("inputUsername");
	private By password1 = By.name("inputPassword");
	private By SignInButton = By.xpath("//button[text()='Sign In']");
	private By ForgotPasswordLink = By.xpath("//a[contains(text(),'Forgot')]");

	// 2. Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// 3. Page Actions/Methods

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean isForgotPwdLinkExist() {

		return driver.findElement(ForgotPasswordLink).isDisplayed();

	}

	public void enterUserName(String userName) {
		driver.findElement(emailId).sendKeys(userName);

	}

	public void enterPassword(String password) {

		driver.findElement(password1).sendKeys(password);
	}

	public void clickOnLogin() {

		driver.findElement(SignInButton).click();

	}
	
	
	public HomePage doLogin(String un, String pwd) {
		
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password1).sendKeys(pwd);
		driver.findElement(SignInButton).click();
         return new HomePage(driver);
	}

}
