package junit;

import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

// @Tag("fast")
public class JunitAnnotationsTest {

    static WebDriver driver;
    static String originalWindowHandle;

    @BeforeAll

    static void beforeAll() {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        driver = new ChromeDriver(options);
        originalWindowHandle = driver.getWindowHandle();
    }

    @BeforeEach
    public void setUpBrowser() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Test
    @Tag("fast")
    public void perry() throws InterruptedException {
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void power() throws InterruptedException {
        driver.get("https://facebook.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    public void assumeTest() throws InterruptedException {

        Assumptions.assumeTrue("true".equals("true"));
        driver.get("https://instagram.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(1000);
        assertTrue(true);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        // driver.switchTo().window(originalWindowHandle);
        HashSet<String> set=(HashSet)driver.getWindowHandles();
        String str=set.iterator().next();
        driver.switchTo().window(str);
        
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
