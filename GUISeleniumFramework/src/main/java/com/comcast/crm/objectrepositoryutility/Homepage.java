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
	@FindBy(xpath = "//span[text()='admin']")
	private WebElement adminLink;
	
	@FindBy(xpath = "//a[@title='Logout (Keyboard shortcut ALT + l)']")
	private WebElement LogoutBtn;
	
	@FindBy(id = "mainmenua_billing")
	private WebElement billingAndPaymnets;
		
@FindBy(xpath="//span[text()='Products | Services']")
private WebElement productsServicesLnk;
	


	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}


	public WebElement getBillingAndPaymnets() {
		return billingAndPaymnets;
	}

	public WebElement getProductsAndServiceslnk() {
		return productsServicesLnk;
	}
	public void logout() {
		

		getAdminLink().click();
		getLogoutBtn().click();
	}


}
