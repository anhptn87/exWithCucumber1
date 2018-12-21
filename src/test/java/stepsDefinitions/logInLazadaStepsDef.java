package stepsDefinitions;

import javax.swing.text.Utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LazadaLoginPage;

public class logInLazadaStepsDef {
	WebDriver driver = Hook.driver;
	LazadaLoginPage lfb;

	@Given("^I am at lazada log in page$")
	public void i_am_at_lazada_log_in_page() throws Exception {
		lfb = new LazadaLoginPage(driver);
		driver.get("https://member.lazada.vn/user/login");
	}

	@When("^I click on Facebook button and enter my credentail$")
	public void i_click_on_Facebook_button_and_enter_my_credentail() throws Exception {
		lfb.btn_loginwithFB.click();
		// switch to FB
		Utility.switch_window(driver, "");
		lfb.txt_email.sendKeys("anhptn1@qa.team");
		lfb.txt_password.sendKeys("a11111111");
		lfb.btn_loginFB.click();
		/*if (lfb.btn_confirmLogin.isDisplayed())
			lfb.btn_confirmLogin.click();*/
	}

	@Then("^I can log in successfully$")
	public void i_can_log_in_successfully() throws Exception {
		Utility.switch_window(driver, "");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@id='myAccountTrigger']")));
		System.out.println(lfb.lbl_accName.getText());
		Assert.assertTrue(lfb.lbl_accName != null);
	}

}
