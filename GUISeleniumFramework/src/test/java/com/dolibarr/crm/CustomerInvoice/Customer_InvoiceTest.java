package com.dolibarr.crm.CustomerInvoice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
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
    	
//    	String[] a = InvoiceRef.split(" ");
//    	
//    	System.out.println(a.length);
//    	
//    	
//    	InvoiceRef = a[0];
//    	
//    	System.out.println(InvoiceRef);
    	
    	InvoiceRef = InvoiceRef.substring(0, 9);
    	System.out.println(InvoiceRef);
    	
    	bP.getCus_listLink().click();
    	Customer_List cL = new Customer_List(driver);
    	List<WebElement> invoiceList = cL.getInvoceList();
    	
    	cL.getSearchRef().sendKeys(InvoiceRef);
    	Thread.sleep(4000);
    	cL.getSearchButton().click();
    	
    	
    	for(WebElement i:invoiceList)
    	{
    		if(i.equals(invoiceList))
    		{
    			//org.testng.Assert.assertEquals(i,InvoiceRef);
    			UtilityClassObject.getTest().log( Status.PASS,"CreateInvoice");		
    		}
    	}
	}
    public void createInVoiceWithPaidStatus() throws Throwable
    {
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
        cNI.getAddProductDropdown().click();
        cNI.getAddProductText().sendKeys(fLib.getDataFromPropertiesFile("product"));
        WebElement product = driver.findElement(By.xpath("//li[contains(text(),'"+fLib.getDataFromPropertiesFile("product")+"')]"));
        product.click();
        cNI.getAddProductButton().click();
        cNI.getValidateLink().click();
        String InvoiceRef = cNI.getValidatedinvoiceNumb().getText();
        cNI.getYesButton().click();
        bP.getCus_listLink().click();
        Customer_List cL = new Customer_List(driver);
        List<WebElement> invoiceList = cL.getInvoceList();
        cL.getSearchRef().sendKeys(InvoiceRef);
cL.getSearchButton().click();
    	
    	
    	for(WebElement i:invoiceList)
    	{
    		if(i.equals(invoiceList))
    		{
    				
    		}
    	}
    	
    }
}
