package com.demowebshop.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Utility {
 WebDriver driver;
 public void WaitUtitlity(WebDriver driver) {
	 this.driver=driver;
	 
 }
 
 //wait for element to load
 public void waitForAllLocatedElement(long secondsToWait) {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
	 
 }
 //wait for element to load
 public void waitForWebPageToLoad(long secondsToWait) {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
	 
 }
 public void waitForElementToClickable(long secondsToWait,WebElement target) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(secondsToWait));
	 wait.until(ExpectedConditions.elementToBeClickable(target));
 }
 public void waitForElementToBeVisible(long secondsToWait,WebElement target) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(secondsToWait));
	 wait.until(ExpectedConditions.visibilityOf(target));
 }
}
