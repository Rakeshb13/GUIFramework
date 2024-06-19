package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebElement getUsenameTB() {
		return UsenameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "username")
	private WebElement UsenameTB;
	
	@FindBy(id = "password")
	private WebElement PasswordTB;
	
	@FindBy(xpath = "//input[@class='button']")
	private WebElement LoginBtn;
	
	public void login(String url,String userName , String password) {
		driver.get(url);
		UsenameTB.sendKeys(userName);
		PasswordTB.sendKeys(password);
		LoginBtn.click();
	}
  }
