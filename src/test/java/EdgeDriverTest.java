package test.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        System.setProperty("webdriver.edge.driver","./Resources/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        // options.addArguments("--headless");
        // options.setHeadless(true);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
        driver.quit();
    }
}
