package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// @Tag("fast")
public class JunitParallelTest {


    @BeforeEach
    public void setUpBrowser() {
       
    }

    @Test
    public void perry() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        assertTrue(true);
        driver.close();
        
    }

    @Test
    public void power() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        assertTrue(true);
        driver.close();
    }

    @Test
    public void assumeTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Assumptions.assumeTrue("true".equals("true"));
        driver.get("https://instagram.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        Thread.sleep(2000);
        assertTrue(true);
        driver.close();
    }

    @AfterEach
    public void tearDown() {
      
    }
}
