package com_DemoWebShop_Object_Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {
	WebDriver driver;
	public welcomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText= "Log in")
	private  WebElement logInLink;
	
	@FindBy(linkText= "Register")
	private  WebElement registerLink;
	
	@FindBy(xpath ="//div[@class='header-links']//a[@href='/customer/info']")
	private WebElement registerdEmailText;
	
	//Getters
	public WebElement getLogInLink() {
		return logInLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	public WebElement registerdEmailText() {
		return registerdEmailText;
	}
	
	//Business logic
	public void ClickOnLogin() {
		logInLink.click();	
	}
	
	public void ClickOnRegister() {
		registerLink.click();	
	}
	
}  


