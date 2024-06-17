package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comcast.crm.generic.basetest.BaseClass;
/*
 * @Author Rashmi
 * 
 * Object Repository for  Product info page
 * 
 */
public class ProductInfoCardPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='refidno opacitymedium']")
	private WebElement productLabelInfo;
	
	@FindBy(xpath="//div[@class='refidno opacitymedium']/parent::div")
	private WebElement productRefInfo;

	@FindBy (xpath="//td[text()='Weight']/following-sibling::td")
	private WebElement prodWeightInfo;
	
	@FindBy(linkText="MODIFY")
	private WebElement modifyProdBtn;
	
	
	public WebElement getModifyProdBtn()
	{
		return modifyProdBtn;
	}
	
	public WebElement getProductLabelInfo()
	{
		return productLabelInfo;
	}
	public WebElement getProductRefInfo()
	{
		return productRefInfo;
	}
	public WebElement getProdWeightInfo()
	{
		return prodWeightInfo;
	}
	public ProductInfoCardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
