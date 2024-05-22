package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, tags="@SmokeTest")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}