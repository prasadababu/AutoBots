package setup;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static final int MAX_RETRY_COUNT = 1; // Maximum retries

    @Override
    public boolean retry(ITestResult result) {
        if (count < MAX_RETRY_COUNT) {
            count++;
            return true; // Retry the test if the retry count is less than MAX_RETRY_COUNT
        }
        return false; // Do not retry if the maximum retry count is reached
    }
}
