package com.comcast.crm.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_List {
	
	WebDriver driver;
	
	public Customer_List(WebDriver driver)
	{this.driver= driver;
	PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (id = "select2-search_status-container")
	private WebElement satausDropdown;
	
	@FindBy (xpath = "//tr[@class='oddeven']//td[@class='nobordernopadding nowraponall']/a")
	private List<WebElement> InvoceList;
	
	@FindBy (xpath = "//input[@name='search_ref']")
	private WebElement searchRef;
	
	@FindBy (xpath = "//button[@name='button_search_x']")
	private WebElement searchButton;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSatausDropdown() {
		return satausDropdown;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public WebElement getSearchRef() {
		return searchRef;
	}


	public void setSearchRef(WebElement searchRef) {
		this.searchRef = searchRef;
	}


	public WebElement getsatausDropdown() {
		return satausDropdown;
	}


	public List<WebElement> getInvoceList() {
		return InvoceList;
	}
}
