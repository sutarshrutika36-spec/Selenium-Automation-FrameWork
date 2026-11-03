package com.demowebshop.generic_utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass implements ITestListener  {
	public void onStart(ITestContext context) {
		System.out.println("----Test Method Execution started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("-----Test method  Executed with Successfully-----");
	}
	

	public void onTestFailure(ITestResult result) {
		System.out.println("----Test method Execution Failed----");
		ScreenShotUtility ssu =new ScreenShotUtility();
		try {
			ssu.CptureWebPage(driver);
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("---Test method Execution Skipped---- ");
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("--Execution is terminated");
	}
	
}
