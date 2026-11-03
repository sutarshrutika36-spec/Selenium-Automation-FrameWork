package com.demowebshop.generic_utilities;


	import java.io.File;
import java.io.IOException;
	//import java.time.LocalDateTime;
	//import java.time.format.DateTimeFormatter;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class ScreenShotUtility {
		public void CptureWebPage(WebDriver driver) throws IOException {
//			String timestamp =LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmSS"));
			javaUtility ju=new javaUtility(driver);
			//go to class framework constant
			//create ;- static final String screenshotpath="./failedScreenShots";
			 TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			//File trg = new File(FrameWorkConstants.screenshotPath+"/DWSFailer"+ju.getTimeSteamp()+".png");
			File trg = new File(FrameWorkConstants.screenshotpath+"./FailedScreenShot"+
			ju.fetchTimeStamp()+".png");
			FileHandler.copy(src, trg);
			
		}


		

	}

