package com.dolibarr.crm.CustomerInvoice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.BillingAndPayments;
import com.comcast.crm.objectrepositoryutility.Customer_List;
import com.comcast.crm.objectrepositoryutility.Customer_NewInvoice;
import com.comcast.crm.objectrepositoryutility.Homepage;

public class Customer_InvoiceTest extends BaseClass{
    @Test
	public void createInVoice() throws Throwable {
    	Homepage hP = new Homepage(driver);
		hP.getBillingAndPaymnets().click();
		BillingAndPayments bP = new BillingAndPayments(driver);
    	bP.getCus_NewInvoiceLink().click();
    	Customer_NewInvoice cNI = new Customer_NewInvoice(driver);
    	cNI.getCustomerDropdown().click();
    	cNI.getCustomerTextField().sendKeys(fLib.getDataFromPropertiesFile("customerName"));
 	  	WebDriverUtility wDU = new WebDriverUtility();
 	  	wDU.waitForPageToLoad(driver);
 	  	WebElement CustomerOption = driver.findElement(By.xpath("//li[contains(text(),'"+fLib.getDataFromPropertiesFile("customerName")+"')]"));
     	wDU.mousemoveOnElement(driver, CustomerOption);
     	cNI.getStandardRadioButton().click();
     	cNI.getInvoiceDate().click();
     	cNI.getPaymentTermDropdown().click();
    	driver.findElement(By.xpath("//li[text()='30 days']")).click();
    	cNI.getPaymentMethodDropdown().click();
        driver.findElement(By.xpath("//li[text()='Cash']")).click();
        cNI.getCreateDraftBtn().click();
     	
     	
    	String InvoiceRef = cNI.getInvoiceRef().getText();
    	bP.getCus_listLink().click();
    	Customer_List cL = new Customer_List(driver);
    	List<WebElement> invoiceList = cL.getInvoceList();
    	
    	System.out.println(InvoiceRef);
    	
    	for(WebElement i:invoiceList)
    	{
    		System.out.println(i.getText());
    	}
    	
//     	
//     	
 
	}
}
