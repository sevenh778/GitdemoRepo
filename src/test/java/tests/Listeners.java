package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("Test is initiating with all configurations :  "+context);
		
	}
	public void OnTestStart(ITestResult result) {
		System.out.println("Test is starting:  "+result);
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed:    "+result.getName());
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is success  :  "+result.getName());
		
	}
	public void onFinish(ITestResult result) {
		System.out.println("Test is Finished :  ");
	}


}
