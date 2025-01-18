package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathTest {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");

        driver.findElement(By.cssSelector("#firstName")).sendKeys("Hello ");
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("namaste ");
        driver.findElement(By.cssSelector("input.name")).sendKeys("brother ");
        driver.findElement(By.cssSelector("input[id=firstName]")).sendKeys("neekosame ");

        // driver.findElement(By.cssSelector("#firstName")).sendKeys("Hello");

        // driver.findElement(By.cssSelector("#firstName")).sendKeys("Hello");

        // driver.findElement(By.cssSelector("#firstName")).sendKeys("Hello");

        // driver.findElement(By.cssSelector("#firstName")).sendKeys("Hello");
        
        // driver.quit();
    }
}
