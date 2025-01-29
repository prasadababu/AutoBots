package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class baseMethods {

    public void infoLogScreenshot(WebDriver driver, ExtentTest test, String desc) {
        TakesScreenshot screen = (TakesScreenshot) driver;
        String base64 = screen.getScreenshotAs(OutputType.BASE64);
        test.log(Status.INFO, desc, MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());
    }

    public void infoLog(ExtentTest test, String desc) {
        test.log(Status.INFO, desc);
    }

}
