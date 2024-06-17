package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
/*
 * @Author Rashmi
 * 
 * Object Repository for Modify Product page
 * 
 */
public class ModifyProductCardPage {
	WebDriver driver;
	@FindBy(name="weight")
	private WebElement prodWeightTbx;

	@FindBy(xpath="//span[@title='kg']")
	private WebElement weightKgUnits;

	@FindBy(xpath="//li[text()='mg']")
	private WebElement weightMgUnits;

	@FindBy(xpath="//li[text()='ton']")
	private WebElement weightTonUnits;

	@FindBy(xpath="//li[text()='g']")
	private WebElement weightGramUnits;

	@FindBy(xpath="//li[text()='ounce']")
	private WebElement weightOunceUnits;

	@FindBy(xpath="//li[text()='pound']")
	private WebElement weightPoundUnits;

	@FindBy(xpath="//span[@title='kg']/following-sibling::span/b")
	private WebElement weightArrowIcon;



	@FindBy(name="save")
	private WebElement saveBtn;



	public ModifyProductCardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getProdWeightTbx()
	{
		return prodWeightTbx;
	}
	public WebElement getWeightKgUnits()
	{
		return weightKgUnits;
	}

	public WebElement getWeightMgUnits()
	{
		return weightMgUnits;
	}

	public WebElement getWeightOunceUnits()
	{
		return weightOunceUnits;
	}

	public WebElement getWeightPoundUnits()
	{
		return weightPoundUnits;
	}
	public WebElement getWeightGramUnits()
	{
		return weightGramUnits;
	}

	public WebElement getWeightTonUnits()
	{
		return weightTonUnits;
	}


	public WebElement getWeightArrowIcon()
	{
		return weightArrowIcon;
	}

	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
	public void modifyWeight(String weight,String units)
	{

		getProdWeightTbx().sendKeys(weight);
		getWeightArrowIcon().click();
		WebDriverUtility wutil=new WebDriverUtility();

		switch(units) {
		case "mg":wutil.mousemoveOnElement(driver,getWeightMgUnits());
		getWeightMgUnits().click();
		break;
		case "ton":	wutil.mousemoveOnElement(driver,getWeightTonUnits());
		getWeightTonUnits().click();
		break;
		case "pound":wutil.mousemoveOnElement(driver,getWeightPoundUnits());
		getWeightPoundUnits().click();
		break;
		case "gm":wutil.mousemoveOnElement(driver,getWeightGramUnits());
		getWeightGramUnits().click();
		break;
		case "ounce":wutil.mousemoveOnElement(driver,getWeightOunceUnits());
		getWeightOunceUnits().click();
		break;
		default:
		}
		getSaveBtn().click();
	}

}
