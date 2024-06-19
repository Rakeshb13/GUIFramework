package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class ThirdPartyModify extends WebDriverUtility {
	
	WebDriver driver;
	public ThirdPartyModify(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="New Third Party")
	 private WebElement newthirdparty;

	 @FindBy(id="name")
	 private WebElement thirdpartyname;
	 
	 @FindAll({@FindBy(xpath="//span[contains(text(),'Prospect')]") , @FindBy(id="select2-customerprospect-container")})
	 private WebElement prospect;
	 
	 @FindBy(xpath="//input[@value='Create third party']")
	 WebElement createthirdpartybutton;
	 
	 @FindBy(linkText="Modify")
		private WebElement modify;
	 
	 @FindBy(xpath="//input[@value='Save']")
	 private WebElement save;
	 
	 @FindBy(id="name")
	 private WebElement thirdpartynamefield;
	 
	 
	 public void thirdPartyModify(String thrdpartyname) {
		 newthirdparty.click();
		 thirdpartyname.sendKeys(thrdpartyname);
		 prospect.click();
		 createthirdpartybutton.click();
		 modify.click();
		 thirdpartynamefield.clear();
		 thirdpartynamefield.sendKeys(thrdpartyname);
		 save.click();
	 }
	
	
	
	}


