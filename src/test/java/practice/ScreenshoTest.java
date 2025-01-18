package practice;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class ScreenshoTest {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://gh-users-search.netlify.app/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        TakesScreenshot screnshot = (TakesScreenshot) driver;
        File file = screnshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("./Screenshots/Screen.png"));

        } catch (Exception e) {
            System.out.println(e);
        }

        driver.quit();
    }
}
