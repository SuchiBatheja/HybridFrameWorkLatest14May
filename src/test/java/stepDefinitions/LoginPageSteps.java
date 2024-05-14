package stepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginPageSteps {
	
	private static String actualtitle;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {

		//DriverFactory.getDriver().get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(4000);		
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/locatorspractice/");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 actualtitle = loginPage.getLoginPageTitle();
		System.out.println("Page Title is " + actualtitle);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		Assert.assertTrue(actualtitle.contains(expectedTitle));

		// Assert.assertEquals(actualtitle, expectedTitle);

	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());

	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
		

	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	

}
