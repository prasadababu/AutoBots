package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
    @Test
    public void marry() {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");

        Assert.assertTrue(true, "unable to assert");
        driver.quit();
    }

    @Test
    void standardAssertions() {
        Assert.assertTrue(true, "unable to assert");
    }

    @Test
    void groupedAssertions() {
        Assert.assertTrue(true, "unable to assert");
    }
}
