package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/report" },
		monochrome = true,
		features="src/test/resources/viettel/exWithCucumber",
		glue="stepsDefinitions",//,
		dryRun = false
)
public class RunCucumberTest {
}