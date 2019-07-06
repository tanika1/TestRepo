package org.automation.yatra.reporting;

import java.io.IOException;

import org.automation.yatra.utility.Screenshots;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class ExtentListener implements ITestListener {
	
	Screenshots s= new Screenshots();

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Execution Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Execution Passed yayyy");
		try {
			System.out.println("Capture Pass Screenshot");
			s.TakeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while capturing Passed Screenshots");
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Execution Failed ooops");
		try {
			s.TakeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		Logger.info("PASSED TEST CASES");
		context.getPassedTests().getAllResults()
          .forEach(result -> {LOGGER.info(result.getName());});
         
        LOGGER.info("FAILED TEST CASES");
        context.getFailedTests().getAllResults()
          .forEach(result -> {LOGGER.info(result.getName());});
         
        LOGGER.info(
          "Test completed on: " + context.getEndDate().toString());

	}
	

	
}
