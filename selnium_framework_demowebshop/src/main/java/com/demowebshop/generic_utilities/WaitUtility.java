package com.demowebshop.generic_utilities;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	

	public class WaitUtility {
		WebDriver driver;
		public WaitUtility(WebDriver driver) {
			this.driver=driver;
			
		}
	//wait for element to load
		public void waitForAllLocatedElement(long secondsToWait) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
			
		}
		//wait for page to load
		public void WaitForWebPageToLoad(long secondsToWait) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secondsToWait));
			
		}
		
		//wait for element to be clickable
		public void waitForElementToClickable(long secondsToWait,WebElement target) {
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(secondsToWait));
			wait.until(ExpectedConditions.elementToBeClickable(target));
			
		}
		//wait for element for visible
		public void waitForElementToBeVisible(long secondsToWait,WebElement target) {
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(secondsToWait));
			wait.until(ExpectedConditions.visibilityOf(target));
		}
	}

