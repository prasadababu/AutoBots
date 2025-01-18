package test.java;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // ImplicitWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // driver.get("https://google.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement we = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        // This is how we specify the condition to wait on.
        // This is what we will explore more in this chapter
        wait.until(ExpectedConditions.alertIsPresent());

        // WebElement we = driver.findElement(By.id("first-name"));
        System.out.println("HELLLLLLOOOOOOO");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

        js.executeScript("arguments[0].value='Prasad Nadimpalli';", we);
        Thread.sleep(3000);
        String str = (String) js.executeScript("return arguments[0].value;", we);
        System.out.println("Value is: " + str);

        driver.quit();
    }
}
