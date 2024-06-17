package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;


	public class ThirdParties extends WebDriverUtility{                                     
		WebDriver driver;
		 public ThirdParties(WebDriver driver) {             
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		    @FindBy(linkText="Third-parties") 
		    private WebElement thirdparties;
		    
		 @FindBy(linkText="New Third Party")
		 private WebElement newthirdparty;

		 public WebDriver getDriver() {
			return driver;
		}
		 


		public WebElement getNewthirdparty() {
			return newthirdparty;
		}


		public WebElement getThirdpartyname() {
			return thirdpartyname;
		}


		public WebElement getProspect() {
			return prospect;
		}


		public WebElement getCreatethirdpartybutton() {
			return createthirdpartybutton;
		}

		@FindBy(id="name")
		 private WebElement thirdpartyname;
		 
		 @FindAll({@FindBy(xpath="//span[contains(text(),'Prospect')]") , @FindBy(id="select2-customerprospect-container")})
		 private WebElement prospect;
		 
		 @FindBy(xpath="//input[@value='Create third party']")
		 WebElement createthirdpartybutton;
		 
		 
		 public void newThirdPartyProspect(String thrdpartyname) {
			 thirdparties.click();
			 newthirdparty.click();
			 thirdpartyname.sendKeys(thrdpartyname);
			 prospect.click();
			 createthirdpartybutton.click();
		 }
			 
			 
		 
		
		 

}
