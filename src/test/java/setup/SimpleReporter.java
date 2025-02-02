package setup;

import org.testng.ITestContext;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

import java.util.LinkedList;
import java.util.List;

public class SimpleReporter implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        // Print the header of the report
        Reporter.log("Custom TestNG Report", true);

        // Loop through each suite
        for (ISuite suite : suites) {
            Reporter.log("Suite Name: " + suite.getName(), true);
            // Loop through each test in the suite
            suite.getResults().forEach((testName, result) -> {
                Reporter.log("Test Name: " + testName, true);
                ITestContext testContext = result.getTestContext();

                // Check if there are failed tests
                List<ITestResult> failedTests = new LinkedList<ITestResult>(testContext.getFailedTests().getAllResults());
                if (!failedTests.isEmpty()) {
                    ITestResult testResult = failedTests.get(0);  // Get the first failed test
                    Reporter.log("Test Status: FAILED", true);
                    Reporter.log("Failure Reason: " + testResult.getThrowable(), true);
                } else {
                    Reporter.log("Test Status: PASSED", true);
                }
            });
        }
    }
}
