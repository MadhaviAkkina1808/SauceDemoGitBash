package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Feature",
		glue="Steps",
		dryRun=false,
		monochrome=false
		//tags=
		)
public class RunnerTestClass extends AbstractTestNGCucumberTests{

}
