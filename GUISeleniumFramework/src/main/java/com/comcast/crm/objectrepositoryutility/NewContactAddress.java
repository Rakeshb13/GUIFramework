package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class NewContactAddress extends WebDriverUtility{
	WebDriver driver;
	public NewContactAddress(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="New Contact/Address")
	private WebElement newcontact;
	
	@FindBy(id="lastname")
	private WebElement lastname;
	@FindBy(xpath="//span[contains(text(),'Select a third party')]")
	private WebElement thirdpartyfield;
	
	@FindBy(xpath="//input[@value='Add']")
	private WebElement addbutton;
	
	
	
	public void newContadd(String lastnme) {
		newcontact.click();
		lastname.sendKeys(lastnme);
		thirdpartyfield.click();
		addbutton.click();
	}
}
		
		
	
	
	
	
	

	
