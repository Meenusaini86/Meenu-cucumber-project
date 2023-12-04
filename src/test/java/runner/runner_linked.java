package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) // Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/linkedlistedreport.html" }, // reporting purpose
		monochrome = false, // console output colour
		tags = "@linkedlist", // tags from feature file
		features = { "src/test/resources/features/Linked_listed.feature" }, // location of feature files
		glue = "stepdefinition/Linked_listed_SD") // location of step definition files


public class runner_linked  extends AbstractTestNGCucumberTests{

	@Override

	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
}
}
