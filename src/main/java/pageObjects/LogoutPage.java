package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement butt;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogoutButton() {
        this.butt.click();
        System.out.println("Clicked Logout button");
    }
}
