package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * @Author Rashmi
 * 
 * Object Repository for Create New Service page
 * 
 */
public class NewServicePage {
	WebDriver driver;

	@FindBy(id="ref")
	private WebElement productRefTbx;
	
	@FindBy(name="label")
	private WebElement productLabelTbx;
	
	@FindBy(xpath="//input[@name='add']")
	private WebElement createServiceBtn;
	
	public NewServicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getProductRefTbx()
	{
		return productRefTbx;
	}

	public WebElement getProductLabelTbx()
	{
		return productLabelTbx;
	}
	public WebElement getCreateServiceBtn()
	{
		return createServiceBtn;
	}
	
	public void createService(String productRef,String label)
	{
		getProductLabelTbx().sendKeys(productRef);
		getProductLabelTbx().sendKeys(label);
		getCreateServiceBtn().click();
	}
}
