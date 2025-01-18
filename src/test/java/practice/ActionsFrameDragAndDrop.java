package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsFrameDragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.xpath("(//iframe[contains(@data-src, 'droppable')])[1]"));
        driver.switchTo().frame(iframe);
        List<WebElement> lst = driver.findElements(
                By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']//child::img"));
        System.out.println("sixe is: " + lst.size());
        WebElement element2 = driver.findElement(By.xpath("//*[@id='trash']"));
        for (WebElement webElement : lst) {
            new Actions(driver).clickAndHold(webElement).moveToElement(element2).release().build().perform();
            Thread.sleep(500);
        }

        // Second test
        driver.get("https://practice.expandtesting.com/drag-and-drop");

        WebElement e1 = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement e2 = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions acts = new Actions(driver);
        acts.clickAndHold(e1).moveToElement(e2).release().build().perform();

        // driver.quit();
    }
}
