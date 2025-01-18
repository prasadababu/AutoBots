package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintWebElementsText {
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

        List<WebElement> lst = driver.findElements(By.xpath("//div[@class='followers']//child::h4"));
        System.out.println(lst.size());

        for (WebElement webElement : lst) {
            String str = webElement.getText();
            System.out.println(str);
        }
        driver.quit();
    }
}
