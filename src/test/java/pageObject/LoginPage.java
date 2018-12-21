package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@type='email']")
	public 	WebElement txt_email;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='button']")
	public WebElement bn_login;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
