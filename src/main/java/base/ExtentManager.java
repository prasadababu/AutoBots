package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;
    static ExtentSparkReporter spark;
    final static String filePath = "ReportsAndScreenshots/extent-report.html";

    // Thread-local variable to store ExtentTest instances for each test method.
    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    // Synchronized method to initiate the reporter and set up ExtentReports and ExtentSparkReporter.
    public synchronized static void initiateReporter() {
        if (extent == null) {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter(filePath);
            extent.attachReporter(spark);
        }
    }

    // Getter for the current thread's ExtentTest.
    public synchronized static ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    // Setter for the current thread's ExtentTest.
    public synchronized static void setTest(ExtentTest test) {
        extentTestThreadLocal.set(test);
    }

    // Flush the extent report after all tests have finished.
    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
