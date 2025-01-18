package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDriverTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./msedgedriver.exe");

        System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");

        // Initialize Gecko Driver using Desired Capabilities Class

        // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        // capabilities.setCapability("marionette", true);
        // WebDriver driver = new FirefoxDriver(capabilities);

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        // options.setHeadless(true);

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
        driver.quit();
    }
}
