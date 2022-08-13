import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//TestNGListeners is implementing ITestListener interface
public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case execute successfully.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case failed for " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}