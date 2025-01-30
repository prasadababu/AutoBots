package setup;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import base.ExtentManager;

public class SuiteSetup {

    @BeforeSuite
    void setupReports() {
        ExtentManager.initiateReporter();
        System.out.println("&&&&&&&&&&&&&&&");
    }

    @AfterSuite
    void closeReport() {
        ExtentManager.flush(); // Flush once at the end of all tests
        System.out.println("@@@@@@@@@@@@@@@");

    }
}