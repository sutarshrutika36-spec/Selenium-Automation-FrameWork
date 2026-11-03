package com.demowebshop.login;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.demoWebShop.generic_utilities.WaitUtility;
import com.demoWebShop.generic_utilities.WebDriverUtility;
import com.demoWebShop.objectRepository.LoginPage;
import com.demoWebShop.objectRepository.Welcome_page;

public class LoginTest {
	@Test
	public void loginAsVaildUser() throws FileNotFoundException, IOException {

//	public static void main(String[] args) throws IOException {
		//read the data from properties file
		FileInputStream fis = new FileInputStream("./src/test/resources/com/demowebshop/testdata/common_data/Login.properties");
		Properties property=new Properties();
		property.load(fis);
		String browser = property.getProperty("browser");
		String url = property.getProperty("applicationUrl");
		String email = property.getProperty("validEmail");
		String password = property.getProperty("ValidPassword");
		
		//launch browser
		WebDriver driver = null;
		if (browser.contains("chrome")) {
			driver= new ChromeDriver();	
		}else if (browser.contains("edge")) {
			driver= new EdgeDriver();	
		}else if (browser.contains("firefox")) {
			driver= new FirefoxDriver();
		}else {
			System.out.println("Enter valid Browser");
		}
		
		WebDriverUtility  wt= new WebDriverUtility(driver);
		WaitUtility wu=new WaitUtility(driver);
		Welcome_page wp = new Welcome_page(driver);
		com_DemoWebShop_Object_Repository.LoginPage lg = new LoginPage(driver);
		wu.waitForAllLocatedElement(20);
		wt.maximizeBrowser();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate to application
		wt.openApplication(url);
		//click on login link
		wp.ClickOnLogin();
		//Enter email and pass and click on login button (clicking is inside the method)
		lg.LoginAsValidUser(email, password);
		
		//verify user is able to login
		if (wp.registerdEmailText().getText().contains(email)) {
			System.out.println("Test : Pass");
			
		} else {
			System.out.println("Test : Fail");

		}
		
		wt.terminateBrowser();
		
	}
}
		
//---------------------------------below code is before POM ----------------------------------------------------		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//navigate to demowebshop
//		driver.get(url);
	
		//click on login link
//		driver.findElement(By.linkText("Log in")).click();
		//enter email
//		driver.findElement(By.id("Email")).sendKeys(email);
		//enter password
//		driver.findElement(By.id("Password")).sendKeys(password);
		//click on login button
//		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
		
		//verify user is able to login 
//		AccountEmailText new = driver.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']"));
//		if (AccountEmail.contains("jkuh@124gmail.com")) {
//			System.out.println("Test: pass");
//			
//		} else {
//			System.out.println("Test: fail");
//
//		}

