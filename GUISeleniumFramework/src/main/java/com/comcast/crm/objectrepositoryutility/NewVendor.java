package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class NewVendor extends WebDriverUtility{
	WebDriver driver;
	 public NewVendor(WebDriver driver) {             
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }
		 @FindBy(linkText="New Vendor")
		 private WebElement newvendor;
		 @FindBy(linkText="Third-parties") 
		    private WebElement thirdparties;
		 
		 @FindBy(id="name")
		 private WebElement thirdpartyname;
		 
		 @FindBy(xpath="//input[@value='Create third party']")
		 WebElement createthirdpartybutton;
		
		 public void newVendor(String thrdpartyname) {
			 thirdparties.click();
			 newvendor.click();
			 thirdpartyname.sendKeys(thrdpartyname);
			 createthirdpartybutton.click();
		 }
		 
		 
		 
}
	 
	 
	 


