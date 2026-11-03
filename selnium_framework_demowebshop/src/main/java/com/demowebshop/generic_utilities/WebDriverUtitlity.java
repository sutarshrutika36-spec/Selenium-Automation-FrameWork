package com.demowebshop.generic_utilities;

	import java.time.Duration;

	//import java.util.Iterator;
	import java.util.Set;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WindowType;

	public class WebDriverUtitlity {
		WebDriver driver;
		public WebDriverUtitlity(WebDriver driver) {
			this.driver=driver;
			
		}
		
		//navigate to application
		public void openApplication(String appURL) {
			driver.get(appURL);
		}
		
		//fetch title 
		public  String fetchTitle() {
			return driver.getTitle();
			
		}
		
		//fetch url
		public  String fetchUrl() {
			return driver.getCurrentUrl();
		}
		
		//get window handle
		public String fetchWindowId() {
			return driver.getWindowHandle();
		}
		
		//get window handles
		public Set<String> fetchWindowIds() {
			return driver.getWindowHandles();
		}
		
		//Switch to child window
		public void switchToWindow(String Title){
			for (String handle : fetchWindowIds()) {
				driver.switchTo().window(handle);
				if (fetchTitle().contains(Title)) {
					break;
					
				}
				
			}
			
		}
		//this for URL
		public void switchControlToWindowUrl(String url) {
		 for (String handle : fetchWindowIds()) {
			 driver.switchTo().window(handle);
			 if (fetchTitle().contains(url)) {
				 break;
				
			}
			
		}
		}
		
		
		//open new tab
		public void openWindow() {
			//use for tab Switch 
			driver.switchTo().newWindow(WindowType.TAB);
		}
		
		//open a new Window
		public void OpenNewTab() {
			//use to Switch window
			driver.switchTo().newWindow(WindowType.TAB);
		}
		
		//switch to Alert
		public void acceptAlert() {
			driver.switchTo().alert().accept();
		}
		public void typeAndAcceptAlert(String text) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
			
		}
		
		//quit
		public void terminateBrowser() {
			driver.quit();		
		}
		
		//Close Browser
		public void CloseBrowser() {
			driver.close();
		}
		
		//switch to frame
		public void switchToFrame(String nameOrId) {
			driver.switchTo().frame(nameOrId);		
		}
		public void SwitchToFrame(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
		
		//maximize windows
		public void maximizeBrowser(){
			driver.manage().window().maximize();	
		}
		
		//Add waits
		public void WaitForElementToLoad(long secounds) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secounds));
			
		}
		

	}

