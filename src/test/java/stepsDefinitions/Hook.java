package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObject.LoginPage;

public class Hook {
	public static WebDriver driver;

	@Before
	public void start() {
		String browser = System.getProperty("browser", "firefox");
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Unsupported webdriver: " + browser);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@After
	public void end(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");

		}
		driver.quit();
	}

}
