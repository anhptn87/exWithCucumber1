package stepsDefinitions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ExtraForm;
import pageObject.HomePage;

import static org.junit.Assert.*;

public class SubscriberSteps {
	WebDriver driver = Hook.driver;
	HomePage hp;
	ExtraForm ex;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Exception {
		driver.get("http://testmaster.vn/");
		hp = new HomePage(driver);
		ex = new ExtraForm(driver);
	}

	@When("^I enter invalid email '(.*?)'$")
	public void i_enter_invalid_email_email(String email) throws Exception {
		hp.txtSubEmail.sendKeys(email);
	}

	@When("^I click on Dang ky button$")
	public void i_click_on_Dang_ky_button() throws Exception {
		hp.btn_sub.click();
	}

	@Then("^I see error message \"([^\"]*)\"$")
	public void i_see_error_message(String arg1) throws Exception {
		String err = hp.errorOnPage.getText();
		assertTrue(err.equalsIgnoreCase(arg1));
	}

	@When("^I enter a valid email to subscriber$")
	public void i_enter_a_valid_email_to_subscriber() throws Exception {
		Date date = new Date();
		hp.txtSubEmail.sendKeys("anhptn" + date.getTime() + "@qa.team");
		hp.btn_sub.click();
	}

	@Then("^The form is initial correctly$")
	public void the_form_is_initial_correctly() throws Exception {
		// full name has asterisk
		Thread.sleep(500);
		System.out.println(ex.lbl_HoVaTen_asterisk.getText());
		Assert.assertTrue(ex.lbl_HoVaTen_asterisk.getText().contains("*"));
		// default value 
		System.out.println(ex.lbl_SelectedGender.getText());
		Assert.assertTrue(ex.lbl_SelectedGender.getText().equalsIgnoreCase("Không xác định"));
		System.out.println(ex.lbl_SelectedNewsType.getText());
		Assert.assertTrue(ex.lbl_SelectedNewsType.getText().equalsIgnoreCase("Nhận tất cả các loại tin"));
	}
	@Given("^I am on the extra form$")
	public void i_am_on_the_extra_form() throws Exception {
		i_am_on_the_home_page();
		i_enter_a_valid_email_to_subscriber();
	}

	@When("^I enter '(.*?)' into the full name field$")
	public void i_enter_into_the_full_name_field(String arg) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='text']")));
		ex.txt_HoVaTen.sendKeys(arg);
	    ex.btn_allow.click();
	}

	@Then("^Error message on Full name appears \"([^\"]*)\"$")
	public void error_message_on_Full_name_appears(String arg1) throws Exception {
		
		Assert.assertTrue(ex.err_messOnForm!=null);
		Assert.assertTrue(ex.err_messOnForm.getText().equalsIgnoreCase(arg1));
	}


	@When("^I fill valid information to all field exept Gender field$")
	public void i_fill_valid_information_to_all_field_exept_Gender_field() throws Exception {
		ex.txt_HoVaTen.sendKeys("Phan Anh");
		ex.btn_allow.click();
	}

	@Then("^Error message on Gender field appears$")
	public void error_message_on_Gender_field_appears() throws Exception {
		Assert.assertTrue(ex.err_messOnForm!=null);
		Assert.assertTrue(ex.err_messOnForm.getText().equalsIgnoreCase("aaa"));
	}

}
