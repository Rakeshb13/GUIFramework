package com.dolibarr.cr.servicetest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.Homepage;
import com.comcast.crm.objectrepositoryutility.NewServicePage;
import com.comcast.crm.objectrepositoryutility.ProductsServicesPage;
import com.comcast.crm.objectrepositoryutility.ServiceInfoCardPage;

/*
 * @Author Rashmi
 * 
 * Test Scripts for Service module
 * 
 */
public class DeleteServiceTest extends BaseClass{
	@Test
	public void verifyServiceIsDeletedTest() throws Throwable
	{
		/*
		 * @Author Rashmi
		 * 
		 * Test Script for Delete  Service test
		 * 
		 */
		
		/*Navigate to Products|Services tab*/
		Homepage hp=new Homepage(driver);
		hp.getProductsAndServiceslnk().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigated to Products|Services tab ");
		String atitle=driver.getTitle();
		Assert.assertEquals("Products and Services", atitle);
		Reporter.log("Navigated to Products and Services");
		
		/*Navigate to Create New Service page*/
		ProductsServicesPage psp=new ProductsServicesPage(driver);
		psp.getNewServiceLnk().click();
		atitle=driver.getTitle();
		Assert.assertEquals("New service", atitle);
		UtilityClassObject.getTest().log(Status.INFO, "Create New Service page ");
		Reporter.log("Create New Service page");
		NewServicePage nsp=new NewServicePage(driver);
		
		/*Fetch the data from excel*/
		ExcelUtility xutil=new ExcelUtility();
		JavaUtility jutil=new JavaUtility();
		String xcelproductRef=xutil.getDataFromExcel("SERVICES",1,2);
		int random=jutil.getRandomNumber();
		String productRef=xcelproductRef+random;
		String xcelLabel=xutil.getDataFromExcel("SERVICES",1,3);
		String label=xcelLabel+random;
		
		/*Create Service*/
		nsp.createService(productRef, label);
		atitle=driver.getTitle();
		
		/*Verify Product ref field for the newly created Service*/

		Assert.assertEquals("Service "+label+" - Card", atitle);
		UtilityClassObject.getTest().log(Status.PASS, "Service "+productRef+" is created with Product ref "+productRef+"and label "+label);
		Reporter.log("Service "+productRef+" is created with Product ref "+productRef+"and label "+label);
		ServiceInfoCardPage pic=new ServiceInfoCardPage(driver);
		String act_Prodref_label=pic.getProductRefInfo().getText();
		String[] act_Prodref = act_Prodref_label.split("\n");
		Assert.assertEquals(productRef, act_Prodref[0]);
		
		/*Delete the service*/
		ServiceInfoCardPage sic=new ServiceInfoCardPage(driver);
		sic.getDeleteServBtn().click();
		sic.getDelServdialogBtn().click();
		/*Verify delete message*/
		String exp_del_msg="Product/Service '"+productRef+"' deleted from database.";
		String actual_msg=driver.findElement(By.xpath("//div[@class='jnotify-message']/div")).getText();
		Assert.assertEquals(exp_del_msg, actual_msg);
		UtilityClassObject.getTest().log(Status.PASS, "Service "+productRef+" is deleted");
		Reporter.log("Service "+productRef+" is deleted");
		
		/*Wait until the Delete message disappears*/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='jnotify-message']/div"))));
	}
}
