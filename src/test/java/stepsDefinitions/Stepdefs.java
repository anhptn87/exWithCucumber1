package stepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {
	WebDriver driver = Hook.driver;
	LoginPage li ;
	

	@Given("^I am on the log in page$")
	public void i_am_on_the_log_in_page() throws Exception {
		li = new LoginPage(driver);
		driver.get("http://testmaster.vn/Account/Login?ReturnUrl=%2fadmin");
	}

	@When("^I put invalid user and blank password$")
	public void i_put_invalid_user_and_blank_password() throws Exception {
		li.txt_email.sendKeys("aa@a");
		li.txt_pass.sendKeys("");
	}

	@When("^I click on log in button$")
	public void i_click_on_log_in_button() throws Exception {
		li.bn_login.click();
	}


	@Then("^I see to tooltip \"([^\"]*)\" at email field$")
	public void i_see_to_tooltip_at_email_field(String arg1) throws Exception {
		String tootip = li.txt_email.getAttribute("data-original-title");
		assertTrue(tootip.equalsIgnoreCase(arg1));
	}

	@Then("^I see tooltip \"([^\"]*)\" at password field$")
	public void i_see_tooltip_at_password_field(String arg1) throws Exception {
		String tootip = li.txt_pass.getAttribute("data-original-title");
		assertTrue(tootip.equalsIgnoreCase(arg1));
	}

	@When("^I put valid user and password$")
	public void i_put_valid_user_and_password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I see the home page$")
	public void i_see_the_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}