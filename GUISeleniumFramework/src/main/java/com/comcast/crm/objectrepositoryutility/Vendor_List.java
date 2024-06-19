package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor_List {

WebDriver driver;
	
	public Vendor_List(WebDriver driver)
	{this.driver= driver;
	PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (id = "select2-search_status-container")
	private WebElement satausDropdown;
	
	public WebElement getsatausDropdown() {
		return satausDropdown;
	}
}
