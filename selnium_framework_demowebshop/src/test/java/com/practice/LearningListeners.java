package com.practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(LearningListeners.class)
public class LearningListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method initiated");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method  Executed with Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method Skipped executed");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution has initaited");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution is completed");
	}
	
	@Test
	public void method()
	{
		System.out.println("Executing test methods");
	}

}
