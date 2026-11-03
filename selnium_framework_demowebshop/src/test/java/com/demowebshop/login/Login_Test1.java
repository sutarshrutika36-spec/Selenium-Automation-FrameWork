package com.demowebshop.login;

	//import java.io.File;
	import java.io.IOException;

	import java.time.Duration;
	//import java.time.LocalDateTime;
	//import java.time.format.DateTimeFormatter;

	import org.openqa.selenium.By;
	//import org.openqa.selenium.OutputType;
	//import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.io.FileHandler;

	import com.demoWebShop.generic_utilities.ScreenShotUtility;

	public class Login_Test1 {
		public static void main(String[] args) throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on login button
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("jkuh@124gmail.com");
			driver.findElement(By.id("Password")).sendKeys("jjk$1997");
			driver.findElement(By.cssSelector("[value='Log in']")).click();
			
			//verifying user is able to log in 
			String accountEmailText = driver.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']")).getText();
			if (accountEmailText.contains("jkuh@124gmail.com")) {
			    System.out.println("Test: pass");
				
			} else {
				 System.out.println("Test: fail");
				 ScreenShotUtility su = new ScreenShotUtility();
				 su.CptureWebPage(driver);

			}
			
			driver.quit();


		}

	}
}
