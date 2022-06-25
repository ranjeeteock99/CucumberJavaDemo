package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/firstTest.feature",
        glue = {"StepDefinitation"}
)
public class Run extends AbstractTestNGCucumberTests {

}
