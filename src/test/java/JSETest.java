package test.java;

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

public class JSETest {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // driver.get("https://google.com");
        driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");

        

        WebDriverWait wdw=new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement we = wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        // WebElement we = driver.findElement(By.id("first-name"));
        System.out.println("HELLLLLLOOOOOOO");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // js.executeScript("location.reload();");
        // js.executeScript("alert('Welcome to Guru99');");
        // Alert alert = driver.switchTo().alert();
        // alert.accept();
        System.out.println(js.executeScript("return document.title;").toString());
        System.out.println(js.executeScript("return document.URL;").toString());
        System.out.println(js.executeScript("return document.domain;").toString());
        // js.executeScript("arguments[0].scrollIntoView(true);", we);
        
        js.executeScript("window.scrollBy(0,200);");
        Thread.sleep(3000);
        js.executeScript("arguments[0].value='Prasad Nadimpalli';", we);	
        Thread.sleep(3000);
        String str=(String)js.executeScript("return arguments[0].value;", we);
        System.out.println("Value is: "+str);
        js.executeScript("console.log('Custom script executed');");
        driver.quit();
    }
}
