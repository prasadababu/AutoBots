package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssertionsTest {
    @Test
    public void marry() {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");

        assertTrue(true, "unable to assert");
        driver.quit();
    }

    @Test
    void standardAssertions() {

        assertTrue(true, "unable to assert");
    }

    @Test
    void groupedAssertions() {
        assertTrue(true, "unable to assert");
    }
}
