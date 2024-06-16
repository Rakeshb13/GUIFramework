package com.comcast.crm.objectrepositoryutility;

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
	
	public WebElement getsatausDropdown() {
		return satausDropdown;
	}
}
