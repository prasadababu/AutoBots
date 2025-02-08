package setup;

import java.lang.reflect.Method;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.ExtentManager;
import base.baseMethods;

public class driverSetup extends baseMethods {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private TakesScreenshot screen;
    private ExtentTest test;

    @BeforeMethod
    public void before(Method method) {
        // Initialize WebDriver for each test method

        ExtentManager.initiateReporter();
        String description = method.getAnnotation(Test.class).description();
        if (description.isEmpty()) {
            description = method.getName(); // Use method name if description is empty
        }
        test = ExtentManager.extent.createTest(description, "Test Description");
        ExtentManager.setTest(test); // Set the test for this thread

        driver.set(new ChromeDriver());
        screen = (TakesScreenshot) driver.get();
    }

    @AfterMethod
    public void after() {

        if (driver.get() != null) {
            driver.get().quit();
        }
        ExtentManager.flush();
    }

    public WebDriver getDriver() {
        return driver.get();
    }
}
