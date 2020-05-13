package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "Features",
		glue = "stepDefination",
		monochrome = true,
		plugin = { "pretty", "html:test-output" }
//		dryRun=true
//		tags = {"@smoke"}

)

public class TestRun {

}
