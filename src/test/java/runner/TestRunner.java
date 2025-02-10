package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", 
    glue = {"stepdefinitions","base"},
    tags="not @Maintag",
    plugin = {"pretty", "html:ReportsAndScreenshots/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
    @Override
    @org.testng.annotations.DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
