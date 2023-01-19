package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import tests.BaseTest;

public class LoginSteps extends BaseTest {
	
	WebDriver driver;
	LoginPage lp;
	
	@Given("User launch(es) login.salesforce.com")
	public void user_launches_login_salesforce_com() throws IOException {
		ExtentTest test=extent.createTest("");
		driver=BaseTest.getDriver();
		lp = new LoginPage(driver, test);
		lp.launchApp(driver);
		
	}


	@When("User enters incorrect username and password")
	public void user_enters_incorrect_username_and_password() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lp.enterUsername(driver, "");
		lp.enterPassword(driver, "");
	}

	@Then("User should not login and should see error message")
	public void user_should_not_login_and_should_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(lp.loginError.getText()," ");
	}
	
	//Cucumber expressions
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Username: "+username+" Password: "+password);
	}

	@Then("User should be login/signin and see homepage")
	public void user_should_be_login_and_see_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
