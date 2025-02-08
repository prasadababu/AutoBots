package stepdefinitions;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import base.ExtentManager;
import base.Hooks;
import base.baseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.LogoutPage;

public class loginStepDefs extends baseMethods {

    // WebDriver driver = getDriver();
    // driver = Hooks.getDriver(); // Ensure driver is initialized
    LandingPage loginPage = new LandingPage(Hooks.getDriver());
    LogoutPage logoutPage = new LogoutPage(Hooks.getDriver());

    @And("user enters User Name")
    public void user_enters_username() {
        loginPage.enterUserName("student");
    }

    @And("user enters password")
    public void user_enters_password() {
        loginPage.enterPassword("Password123");
    }

    @And("user enters {string} as username")
    public void user_enters_custom_username(String str) {
        loginPage.enterUserName(str);
    }

    @And("user enters {string} as password")
    public void user_enters_custom_password(String pas) {
        loginPage.enterPassword(pas);
    }

    @And("user clicks Login button")
    public void user_clicks_login_button() {
        loginPage.clickSubmitButton();

    }

    @Then("login is successful")
    public void login_successful() {
        Assert.assertTrue(Hooks.getDriver().getCurrentUrl().contains("successfully"));
        infoLogScreenshot(Hooks.getDriver(), "Login successful");
        ExtentManager.getTest().log(Status.INFO, "Login successful");
    }

    @Given("user launches practicetestautomation website")
    public void user_launches_practicetestautomation_website() {
        ExtentManager.getTest().log(Status.INFO, "launch practicetestautomation");
        loginPage.launchURL();
    }

    @And("user clicks Logout button")
    public void user_clicks_logout_button() {
        logoutPage.clickLogoutButton();
    }

    @Then("logout is successful")
    public void logout_successful() {
        Assert.assertTrue(Hooks.getDriver().getCurrentUrl().contains("practice-test-login"));
        infoLogScreenshot(Hooks.getDriver(), "Logout successful");
        ExtentManager.getTest().log(Status.INFO, "Logout successful");
    }
}
