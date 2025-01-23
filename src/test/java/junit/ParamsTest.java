package junit;

import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParamsTest {

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

    @ParameterizedTest
    @ValueSource(ints={1,2,3,4,Integer.MAX_VALUE})
    void testSquare(int value) throws InterruptedException {
        // driver.get("https://google.com");
        // driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
        System.out.println("Iteration: "+value);
        Thread.sleep(1000);
        int result = square(value);
        assertEquals(value * value, result, "Square calculation is incorrect");
    }

    private int square(int number) {
        return number * number;
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
