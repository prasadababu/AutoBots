package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;

    By username = By.id("username");

    @FindBy(id = "username")
    WebElement usr;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launchURL() {
        this.driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUserName(String username) {
        this.usr.sendKeys(username);
        System.out.println("Entered " + username + " as username.");
    }

    public void enterPassword(String password) {
        this.driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Entered " + password + " as password.");
    }

    public void clickSubmitButton() {
        this.driver.findElement(By.id("submit")).click();
        System.out.println("Clicked Submit button");
    }

    public Boolean usernameVisible() {
        return this.driver.findElement(this.username).isDisplayed() ? true : false;
    }
}
