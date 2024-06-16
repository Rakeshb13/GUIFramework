package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver ;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "admin")
	private WebElement adminLink;
	
	@FindBy(xpath = "//a[@title='Logout (Keyboard shortcut ALT + l)']")
	private WebElement LogoutBtn;
	
	@FindBy(id = "mainmenua_billing")
	private WebElement billingAndPaymnets;


	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}


	public WebElement getBillingAndPaymnets() {
		return billingAndPaymnets;
	}


	public void logout() {
		
		adminLink.click();
		LogoutBtn.click();
	}


}
