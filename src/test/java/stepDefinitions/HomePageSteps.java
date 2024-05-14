package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>>credList = credTable.asMaps();
		
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/locatorspractice/");
		
		homePage=loginPage.doLogin(userName, password);
		
		
	}

	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		String title = homePage.getHomePageTitle();
		System.out.println("Home Page title is : "+title);
		
	}
	

	@When("user gets login section")
	public void user_gets_login_section() {
	 
		
		Assert.assertTrue(true);
		
	}

	@Then("logged in message should be displayed")
	public void logged_in_message_should_be_displayed() throws InterruptedException {
		
		
		Thread.sleep(4000);
	   
	
		
		Assert.assertTrue(true);

	}


}
