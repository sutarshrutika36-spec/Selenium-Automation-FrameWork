package com_DemoWebShop_Object_Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	@FindBy(id="Email")
	private WebElement emailTextfield;
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	@FindBy(css="[value='Log in']")
	private WebElement logInButton;
	
	
	//Getter
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getLogInButton() {
		return logInButton;
	}
	
	//Business logic
	public void LoginAsValidUser(String VaildEmail,String ValidPassword) {
		emailTextfield.sendKeys(VaildEmail);
		passwordTextfield.sendKeys(ValidPassword);
		logInButton.click();
		
		
		
	}
	
}

