package loginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.ExtentManager;
import pages.LandingPage;
import pages.LogoutPage;
import setup.driverSetup;

public class TestLogin extends driverSetup {

	@Test
	void loginTest() throws InterruptedException {
		LandingPage landingPage = new LandingPage(getDriver());
		getDriver().get("https://practicetestautomation.com/practice-test-login/");
		ExtentManager.getTest().log(Status.INFO, "Login Page");
		// infoLogScreenshot(getDriver(), ExtentManager.getTest(), "Login Page");
		landingPage.enterUserName("student");
		landingPage.enterPassword("Password123");
		landingPage.clickSubmitButton();
		Thread.sleep(1000);

		ExtentManager.getTest().log(Status.INFO, "Logout Page");
		LogoutPage logoutPage = new LogoutPage(getDriver());
		logoutPage.clickLogoutButton();
		Thread.sleep(1000);
		Assert.assertTrue(landingPage.usernameVisible());
		ExtentManager.getTest().log(Status.PASS, "Logout success");
	}

}
