package test.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//button[@onclick='showAlert()']")).getSize());
        driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Alert alt= (Alert)driver.switchTo().alert();

        // alt.accept();
        alt.dismiss();
        driver.quit();
    }
}
