package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class ListOfVendors extends WebDriverUtility {
	WebDriver driver;

	public ListOfVendors(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Third-parties")
	private WebElement thirdparties;

	@FindBy(linkText = "New Third Party")
	private WebElement newthirdparty;

	@FindBy(linkText = "List of Vendors")
	private WebElement vendorslist;

	@FindBy(xpath = "//input[@name='search_nom']")
	private WebElement searchbutton;

	@FindBy(xpath = "//button[@name='button_search_x']")
	private WebElement magnifier;

	public void listOfVendors(String nameofthirdparty) {
		thirdparties.click();
		vendorslist.click();
		searchbutton.sendKeys(nameofthirdparty);
		magnifier.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getThirdparties() {
		return thirdparties;
	}

	public WebElement getNewthirdparty() {
		return newthirdparty;
	}

	

	public WebElement getVendorslist() {
		return vendorslist;
	}

	public void setVendorslist(WebElement vendorslist) {
		this.vendorslist = vendorslist;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getMagnifier() {
		return magnifier;
	}

}
