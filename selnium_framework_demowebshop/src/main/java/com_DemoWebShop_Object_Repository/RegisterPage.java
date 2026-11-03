package com_DemoWebShop_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	//getter

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}


	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	
	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}
	
	public WebElement getregisterButton() {
		return registerButton;
	}
	
	public void registerAsUser(String gender,String FirstName,String LastName,String EmailA,int RandomNumber,String EmailB,String Password){
		if (gender.contains("male")) {
			maleRadioButton.click();
			
		} else {
			femaleRadioButton.click();
		}
		FirstNameTextField.sendKeys(FirstName);
		LastNameTextField.sendKeys(LastName);
		
		EmailTextField.sendKeys(EmailA+RandomNumber+EmailB);
		PasswordTextField.sendKeys(Password);
		ConfirmPasswordTextField.sendKeys(Password);
		registerButton.click();;
	
		
		
	}

}
	
	
	

	
	
	
	
	
	
	
	
	

