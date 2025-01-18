package test.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropTest {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
        Thread.sleep(2000);

        WebElement we = driver.findElement(By.id("country"));

        Select st = new Select(we);
        st.selectByVisibleText("Afghanistan");
        System.out.println();

        List<WebElement> elements = st.getOptions();
        System.out.println(elements.size());
        for (WebElement webElement : elements) {
        System.out.println(webElement.getText());
        }

        driver.quit();
    }
}
