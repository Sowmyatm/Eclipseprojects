package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	
	@Given("User launch(es) login.salesforce.com")
	public void user_launches_login_salesforce_com() {
//		//launch browser and launches app
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =  new ChromeDriver();
//		
//		driver.get("https://login.salesforce.com");
	    
	    //throw new io.cucumber.java.PendingException();
	}

//	@When("User enters username and password")
//	public void user_enters_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}

//	@Then("User should login and see homepage")
//	public void user_should_login_and_see_homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//	}

	@When("User enters incorrect username and password")
	public void user_enters_incorrect_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User should not login and should see error message")
	public void user_should_not_login_and_should_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
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
