package com.practice;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingFindAll {
	static String oHRMUser="Admin";
	static String sLUser="Admin";
	static String oHRMPass="admin123";
	static String sLPass="admin123";
	static String oLUrl="https://opensource-demo.orangehrm";
	static String sLUrl="https://www.saucedemo.com/";
	
	static WebDriver driver;
	UsingFindAll(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	//UserName
	@FindAll({@FindBy(id="user-name"),@FindBy(name="username")})
	WebElement user;
	//Password
	@FindAll({@FindBy(id="password"),@FindBy(name="password")})
	WebElement password;
    //text script
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(sLUrl);
		
		UsingFindAll ua = new UsingFindAll(driver);
		ua.user.sendKeys(sLUser);
		ua.password.sendKeys(sLPass,Keys.ENTER);
		
		driver.quit();	

	}

}