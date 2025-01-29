package practice;

import base.ExtentManager;
import base.baseMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;

// import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtReportsTest extends baseMethods {

    ExtentTest test;

    @BeforeMethod
    static void setupReports() {
        ExtentManager.initiateReporter();
    }

    @org.testng.annotations.Test
    public void perry() throws InterruptedException {
        test = ExtentManager.extent.createTest("Google Test", "Test to validate google");
        test.log(Status.INFO, "Chrome Browser Launched");
        WebDriver driver = new ChromeDriver();
        TakesScreenshot screen = (TakesScreenshot) driver;

        driver.get("https://google.com");
        String fts = screen.getScreenshotAs(OutputType.BASE64);
        test.log(Status.INFO, "Screenshot 1", MediaEntityBuilder.createScreenCaptureFromBase64String(fts).build());

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);

        driver.get("https://facebook.com");
        String sts = screen.getScreenshotAs(OutputType.BASE64);
        test.log(Status.INFO, "Screenshot 2", MediaEntityBuilder.createScreenCaptureFromBase64String(sts).build());

        Assert.assertTrue(true);
        test.log(Status.SKIP, "Navigated to google.com");
        // test.fail("failedddd");
        driver.close();

    }

    @Test
    public void power() throws InterruptedException {
        test = ExtentManager.extent.createTest("Facebook Test", "Test to validate facebook");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
       
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        infoLogScreenshot(driver, test, "Facebook");
        Assert.assertTrue(true);
        test.log(Status.PASS, "Navigated to fb.com");
        driver.close();
    }

    @Test
    public void assumeTest() throws InterruptedException {
        test = ExtentManager.extent.createTest("instagram Test", "Test to validate insta");
       
        WebDriver driver = new ChromeDriver();
        driver.get("https://instagram.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        infoLogScreenshot(driver, test, "Instagram");
        test.log(Status.PASS, "Navigated to instagram.com");
        Assert.assertTrue(true);
        driver.close();
    }

    @AfterMethod
    static void closeReports() {
        // ExtentManager.extent.flush();
    }
}