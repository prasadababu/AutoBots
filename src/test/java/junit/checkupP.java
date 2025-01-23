package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.*;
// import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// @TestInstance(Lifecycle.PER_CLASS)
public class checkupP {

    static ExtentReports extent;
    static ExtentSparkReporter spark;

    @BeforeAll
    static void setupReports() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/results/report.html");
        extent.attachReporter(spark);
    }

    @Test
    public void perry() throws InterruptedException {
        ExtentTest test = extent.createTest("Google Test", "Test to validate google");
        test.log(Status.INFO, "Chrome Browser Launched");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        assertTrue(true);
        test.log(Status.PASS, "Navigated to google.com");
        driver.close();

    }

    @Test
    public void power() throws InterruptedException {
        ExtentTest test = extent.createTest("Facebook Test", "Test to validate facebook");
        test.log(Status.INFO, "Chrome Browser Launched");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        assertTrue(true);
        test.log(Status.PASS, "Navigated to fb.com");
        driver.close();
    }

    @Test
    public void assumeTest() throws InterruptedException {
        ExtentTest test = extent.createTest("instagram Test", "Test to validate insta");
        test.log(Status.INFO, "Chrome Browser Launched");
        WebDriver driver = new ChromeDriver();
        Assumptions.assumeTrue("true".equals("true"));
        driver.get("https://instagram.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        test.log(Status.PASS, "Navigated to instagram.com");
        assertTrue(true);
        driver.close();
    }

    @AfterAll
    static void closeReports() {
        extent.flush();
    }
}