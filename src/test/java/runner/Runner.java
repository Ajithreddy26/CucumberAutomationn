package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",glue={"stepdefinitions"},monochrome=true,dryRun = false,plugin = {"html:reports/cucumberhtml","pretty"},tags="@smoke"
	//	,glue={"stepdefinitions"},monochrome = true,dryRun = false,plugin = {"html:reports/cucumberhtml","pretty"},tags={"@regression"}
		)

public class Runner {

}
