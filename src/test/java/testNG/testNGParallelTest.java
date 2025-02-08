package testNG;

import setup.RetryAnalyzer;
import setup.driverSetup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;

import base.ExtentManager;

// import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
// @Listeners(SimpleReporter.class)
public class testNGParallelTest extends driverSetup {
    // ExtentTest test;
    @Test(description = "Googleeeeeeeeeeeeeee", groups = { "sanity" }, enabled = false)
    public void perry() throws InterruptedException {
        getDriver().get("https://google.com");
        ExtentManager.getTest().log(Status.INFO, "launch google");
        // infoLogScreenshot(getDriver(), ExtentManager.getTest(), "google.com");
        System.out.println(getDriver().getTitle());
        System.out.println(getDriver().getCurrentUrl());
        Thread.sleep(2000);
        ExtentManager.getTest().log(Status.PASS, "Navigated to google.com");
    }

    @Test(groups = { "sanity" }, retryAnalyzer = RetryAnalyzer.class)
    public void power() throws InterruptedException {
        getDriver().get("https://facebook.com");
        ExtentManager.getTest().log(Status.INFO, "launch facebook");
        System.out.println(getDriver().getTitle());
        System.out.println(getDriver().getCurrentUrl());
        Thread.sleep(2000);
        // infoLogScreenshot(getDriver(), ExtentManager.getTest(), null);
        ExtentManager.getTest().log(Status.PASS, "Navigated to facebook.com");
    }

    @Test(description = "instaaaaaa", groups = { "regression" }, dependsOnMethods = { "power" }, enabled = false)
    public void last() throws InterruptedException {
        
        getDriver().get("https://instagram.com");
        System.out.println(getDriver().getTitle());
        System.out.println(getDriver().getCurrentUrl());
        Thread.sleep(2000);
        // infoLogScreenshot(getDriver(), ExtentManager.getTest(), null);
        ExtentManager.getTest().log(Status.PASS, "Navigated to instagram.com");
    }
}