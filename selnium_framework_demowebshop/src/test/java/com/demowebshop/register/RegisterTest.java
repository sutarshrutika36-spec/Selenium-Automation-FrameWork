package com.demowebshop.register;
//import java.io.File;
import java.io.IOException;

import java.time.Duration;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

import com.demoWebShop.generic_utilities.javaUtility;
import com.demoWebShop.objectRepository.Register_Result_page;
import com.demoWebShop.objectRepository.Welcome_page;

public class Register_Test {

	public static void main(String[] args) throws IOException {
		//launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Welcome_page wp = new Welcome_page(driver);
		Register_Result_page rrp = new Register_Result_page(driver);
	
		
		
		
		//navigate to demo shop
		driver.get("https://demowebshop.tricentis.com/");
		//click on register link
//		driver.findElement(By.linkText("Register")).click();
		wp.ClickOnRegister();
		
		//Select gender
		driver.findElement(By.id("gender-female")).click();
		
		//enter fist name
		driver.findElement(By.id("FirstName")).sendKeys("Anaya");
		
	   //enter last name
		driver.findElement(By.id("LastName")).sendKeys("Jeon");
		
		//enter Email
		driver.findElement(By.id("Email")).sendKeys("jkuh@124gmail.com");
		
		//enter password
		driver.findElement(By.id("Password")).sendKeys("jjk$1997");
		//confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("jjk$1997");
		//click on register
		driver.findElement(By.id("register-button")).click();
		
//		//verify if registration is complete
//		WebElement successmessage = driver.findElement(By.cssSelector("[class='result']"));
		if (rrp.getSuccessMessage().isDisplayed()) {
			System.out.println("True");
			
		} else {
			System.out.println("False");
//			String timestamp =LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmSS"));
//			 TakesScreenshot ts = (TakesScreenshot) driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			File trg = new File("/Selenium_Framework_DemoWokeShope/FailedScreenShot/DWSFailer"+timestamp+".png");
//			FileHandler.copy(src, trg);
			


		}
		
	}

}

