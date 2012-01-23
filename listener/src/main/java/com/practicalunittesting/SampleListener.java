package com.practicalunittesting;


import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

/**
 * Prints one char for every test that was executed - DOT for passed, "S" for SKIPPED, "F" for failed - output goes to Syso. See #1200. Copied from TestNG documentation.
 *
 * Example:
 * <pre>
 -------------------------------------------------------
 T E S T S
 -------------------------------------------------------
 Running TestSuite
 FFFS.................................................
 .....................................................
 ......
 Tests run: 112, Failures: 3, Errors: 0, Skipped: 1, Time elapsed: 0.783 sec <<< FAILURE!

 Results :

 Failed tests:
 shouldCreateUriThatContainsOriginalId(pl.swmind.koda.commons.storage.AbstractContentRepositoryStorageTest)
 shouldCreateUriThatContainsOriginalId(pl.swmind.koda.commons.storage.AbstractContentRepositoryStorageTest)
 shouldCreateUriThatContainsOriginalId(pl.swmind.koda.commons.storage.AbstractContentRepositoryStorageTest)

 Tests run: 112, Failures: 3, Errors: 0, Skipped: 1

 [INFO] ------------------------------------------------------------------------
 [ERROR] BUILD FAILURE
 </pre>
 *
 * @author Cedric Beust, Tomek Kaczanowski
 *
 */
public class SampleListener extends TestListenerAdapter  {


    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
    }


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log(result, "failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log(result, "skipped");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log(result, "passed");
    }

    private synchronized void log(ITestResult result, String string) {
        System.out.println(result.getMethod() + " " + string);
    }
    
    

}
