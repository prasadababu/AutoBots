package practice;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesTest {
    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        // Get the handle of the original window
        String originalWindowHandle = driver.getWindowHandle();

        // Open a new WINDOW/TAB
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bing.com");

        // Switch back to the original window
        driver.switchTo().window(originalWindowHandle);

        JavascriptExecutor jr = (JavascriptExecutor) driver;
        jr.executeScript("window.open('https://bing.com','_blank')");
        jr.executeScript("window.open('https://facebook.com')");
        jr.executeScript("window.open('')");

        Thread.sleep(2000);
        Set<String> str = driver.getWindowHandles();
        for (String string : str) {
            driver.switchTo().window(string);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            driver.close();
        }
        Thread.sleep(10000);
        // driver.quit();
    }
}
