package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class NewCustomer  extends WebDriverUtility{
		WebDriver driver;
		 public WebDriver getDriver() {
			return driver;
		}

		public WebElement getNewcustomer() {
			return newcustomer;
		}

		public WebElement getThirdpartyname() {
			return thirdpartyname;
		}

		public WebElement getCreatethirdpartybutton() {
			return createthirdpartybutton;
		}

		public NewCustomer(WebDriver driver) {             
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		@FindBy(linkText="Third-parties") 
	    private WebElement thirdparties;
		 @FindBy(linkText="New Customer")
		 private WebElement newcustomer;
		 @FindBy(id="name")
		 private WebElement thirdpartyname;
		 
		 @FindBy(xpath="//input[@value='Create third party']")
		 WebElement createthirdpartybutton;
		 
		 public void newThirdPartyCustomer(String thrdpartyname) {
			 thirdparties.click();
			 newcustomer.click();
			 thirdpartyname.sendKeys(thrdpartyname);
			 createthirdpartybutton.click();
		 }
		 

}
