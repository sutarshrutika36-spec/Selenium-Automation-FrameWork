package com.demowebshop.generic_utilities;
import java.io.FileNotFoundException;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {
	public static WebDriver driver;
	public Wait_Utility wdu;
	public String browser;
	public String url;
	public String email;
	public String password;
	
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("----Executing Before Suite---");
	}
	
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("----Executing After Suite---");
	}
	
	@BeforeTest
	public void configBeforeTest() {
		System.out.println("----Executing Before Test---");
	}
	
	@AfterTest
	public void configAfterTest() {
		System.out.println("-----Executing After Test");		
	}

	@BeforeClass
	public void configBeforeClass() throws  FileNotFoundException, IOException{
		System.out.println("-----Executing Before Class");	
			FileUtilities fu=new FileUtilities();
			browser =fu.readkeyValueFromPropertyFile("browser");
			url = fu.readkeyValueFromPropertyFile("applicationUrl");
			email = fu.readkeyValueFromPropertyFile("validEmail");
			password =fu.readkeyValueFromPropertyFile("validPassword");	
		}
	
	
	@AfterClass
	public void configAfterClass() {
//		System.out.println("---Executing After Class---");	
		Reporter.log("---Executing After Class---");
	}
	//@Parameters("browser")
	@BeforeMethod
	public void configBeforeMethod() {
		
			//System.out.println("---Executing Before Method---");
		Reporter.log("---Executing  Before Method---");
			//Launching the browser
			
		WebDriver driver = null;
		if (browser.contains("chrome")) {
			driver= new ChromeDriver();
			
		} else if (browser.contains("edge")){
			driver= new EdgeDriver();
			
		} else if (browser.contains("firefox")) {
			driver= new FirefoxDriver();
			
		}else {
			System.out.println("Enter Vaild Browser");
			
		
			//Maximize
			wdu=new WaitDriverUtility(driver);
			wdu.maximizeBrowser();
			//Wait
			WaitUtility wu=new WaitUtility(driver);
			wu.waitForAllLocatedElement(10);
			//Navigating to app
			wdu.openApplication(url);
		}
		
	
	@AfterMethod
	public void configAfterMethod() {
		System.out.println("-----Executing After Method---");
		//quite browser
		wdu.terminateBrowser();
		
	}
}

