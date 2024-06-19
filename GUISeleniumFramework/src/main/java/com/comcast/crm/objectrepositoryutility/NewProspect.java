package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class NewProspect extends WebDriverUtility{
	WebDriver driver;
	 public NewProspect(WebDriver driver) {             
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(linkText="New Prospect")
	 private WebElement newprospect;
	 @FindBy(linkText="Third-parties") 
	    private WebElement thirdparties;
	 
	 public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewprospect() {
		return newprospect;
	}

	public WebElement getThirdparties() {
		return thirdparties;
	}

	public WebElement getThirdpartyname() {
		return thirdpartyname;
	}

	public WebElement getCreatethirdpartybutton() {
		return createthirdpartybutton;
	}

	@FindBy(id="name")
	 private WebElement thirdpartyname;
	 
	 @FindBy(xpath="//input[@value='Create third party']")
	 WebElement createthirdpartybutton;
	
	 public void newProspect(String thrdpartyname) {
		 thirdparties.click();
		 newprospect.click();
		 thirdpartyname.sendKeys(thrdpartyname);
		 createthirdpartybutton.click();
	 }
	 
}
