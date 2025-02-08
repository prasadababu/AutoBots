package base;

// import setup.RetryAnalyzer;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private TakesScreenshot screen;
    private ExtentTest test;
    // private RetryAnalyzer retryAnalyzer = new RetryAnalyzer();

    @Before
    public void before(Scenario scenario) {
        // Initialize WebDriver for each test method

        ExtentManager.initiateReporter();
        // String description=method.getAnnotation(Test.class).description();
        String description = scenario.getName();
        // if (description.isEmpty()) {
        // description = method.getName(); // Use method name if description is empty
        // }
        test = ExtentManager.extent.createTest(description, "Test Description");
        ExtentManager.setTest(test); // Set the test for this thread

        driver.set(new ChromeDriver());
        screen = (TakesScreenshot) driver.get();
    }

    @After
    public void after(Scenario scenario) {

        if (scenario.isFailed()) {
            // int retryCount = retryAnalyzer.getMaxRetryCount();
            // if (retryCount >= 3) {
            ExtentManager.getTest().log(Status.FAIL, "scenario failed");
            System.out.println("Scenario failed: " + scenario.getName());
            // }

        } else {
            ExtentManager.getTest().log(Status.PASS, "scenario passed");
            System.out.println("Scenario passed: " + scenario.getName());
        }

        if (driver.get() != null) {
            driver.get().quit();
        }
        ExtentManager.flush();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
