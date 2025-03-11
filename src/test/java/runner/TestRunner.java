package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "StepDefinitions",
  
    plugin = {"pretty", "json:target/result.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests 
{
	
}
