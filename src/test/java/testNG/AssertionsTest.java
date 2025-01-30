package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
    @Test(groups = {"sanity"})
    public void marry() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        Thread.sleep(2000);
        Assert.assertTrue(true, "unable to assert");
        driver.quit();
    }

    @Test(groups = {"sanity"})
    void standardAssertions() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        Thread.sleep(2000);

        Assert.assertTrue(true, "unable to assert");
        driver.quit();
    }

    @Test(groups = {"sanity"})
    void groupedAssertions() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        Thread.sleep(2000);

        Assert.assertTrue(true, "unable to assert");
        driver.quit();
    }
}
