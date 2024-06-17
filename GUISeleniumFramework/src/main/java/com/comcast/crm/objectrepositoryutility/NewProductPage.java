package com.comcast.crm.objectrepositoryutility;
/*
 * @Author Rashmi
 * 
 * Object Repository for Create New Product page
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

public class NewProductPage extends BaseClass{
	WebDriver driver;

	@FindBy(id="ref")
	private WebElement productRefTbx;

	@FindBy(name="label")
	private WebElement productLabelTbx;

	@FindBy(xpath="//input[@name='add']")
	private WebElement createProductBtn;

	@FindBy(name="weight")
	private WebElement weightTbx;
	
	@FindBy(xpath="//li[text()='Manufactured product']")
	private WebElement natureManufactLst;
	public NewProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProductRefTbx()
	{
		return productRefTbx;
	}

	public WebElement getproductLabelTbx()
	{
		return productLabelTbx;

	}

	public WebElement getCreateProductBtn()
	{
		return createProductBtn;
	}

	public WebElement getWeightTbx()
	{
		return weightTbx;
	}
	
	public WebElement getNatureManufactLst()
	{
		return natureManufactLst;
	}
	/* 
	 * Overloaded Business utility to create a product 
	 * 
	 */
	public void createProduct(String productRef,String productLabel )
	{
		getProductRefTbx().sendKeys(productRef);
		getproductLabelTbx().sendKeys(productLabel);
		getCreateProductBtn().click();
	}

	public void createProduct(String productRef,String productLabel,String weight )
	{
		getProductRefTbx().sendKeys(productRef);
		getproductLabelTbx().sendKeys(productLabel);
		getWeightTbx().sendKeys(weight);
		getCreateProductBtn().click();

	}


}
