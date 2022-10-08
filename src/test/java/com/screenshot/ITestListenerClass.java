package com.screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getMethod().getMethodName()+" console ");
		captureScreenshot(result.getMethod().getMethodName()+".jpg");
		
	}

	
	
}
