package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));

        Actions acts = new Actions(driver);
        acts.click(element).perform();
        WebElement element2 = driver.findElement(By.xpath("//input[@id='identifierId']"));
        element2.sendKeys("prasadababunadimpalli");
        element2.click();
        acts.keyDown(Keys.CONTROL).perform();
        acts.sendKeys("a").perform();
        acts.sendKeys("x").perform();
        acts.keyUp(Keys.CONTROL).perform();
        element2.sendKeys("Nadimpalli");
        // driver.quit();
    }
}
