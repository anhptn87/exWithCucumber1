package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LazadaLoginPage {
	@FindBy(xpath = "//button[contains(@class,'mod-third-party-login-fb')]")
	public WebElement btn_loginwithFB;
	@FindBy(id = "email")
	public WebElement txt_email;
	@FindBy(id = "pass")
	public WebElement txt_password;
	@FindBy(xpath = "//input[@name='login']")
	public WebElement btn_loginFB;
	@FindBy(xpath = "//button[@name='__CONFIRM__']")
	public WebElement btn_confirmLogin;
	@FindBy(xpath="//span[@id='myAccountTrigger']")
	public WebElement lbl_accName;

	public LazadaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
