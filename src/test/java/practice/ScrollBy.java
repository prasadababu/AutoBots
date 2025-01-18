package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBy {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.javatpoint.com/selenium-webdriver-locating-strategies");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        System.out.println(js.executeScript("return document.title;").toString());
        System.out.println(js.executeScript("return document.URL;").toString());
        System.out.println(js.executeScript("return document.domain;").toString());
        // js.executeScript("arguments[0].scrollIntoView(true);", we);
        Thread.sleep(3000);
        js.executeScript("scrollTo(0,300)");

        // js.executeScript("argument[0].scrollIntoView(true);", element)

        // driver.quit();
    }
}
