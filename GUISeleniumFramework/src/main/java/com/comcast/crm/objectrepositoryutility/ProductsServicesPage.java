package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

/*
 * @Author:Rashmi
 * Object Repository for Products And Services Page
 */
public class ProductsServicesPage  extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//a[@title='New product']")
	private WebElement newProductLnk;
	
	@FindBy(xpath="http://49.249.28.218:8889/dolibarr/product/list.php?leftmenu=product&type=0")
	private WebElement productListLnk;
	
	@FindBy(xpath="//a[@title='New service']")
	private WebElement newServiceLnk;
	
	public ProductsServicesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getNewProductLnk()
	{
		return newProductLnk;
	}

	public WebElement getProductListLnk()
	{
		return productListLnk;
	}
	
	public WebElement getNewServiceLnk()
	{
		return newServiceLnk;
	}
}
