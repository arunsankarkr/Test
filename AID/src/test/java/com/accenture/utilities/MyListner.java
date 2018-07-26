package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListner implements ITestListener {
	ExtentReports r;
	ExtentTest t ;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Test Finish");
		r.endTest(t);
		r.flush();
	}

	public void onStart(ITestContext arg0) {
		//System.out.println("Test Start");
		 r = new ExtentReports("C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\MvnProject_Arun\\AID\\src\\test\\java\\Myreport.html");
		 r.addSystemInfo("User","Arun");
		 r.addSystemInfo("Browser","Chrome");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Failed");
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"has passed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		t=r.startTest(result.getMethod().getMethodName()+"has Started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Passed");
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"has passed");
		
	}

}
