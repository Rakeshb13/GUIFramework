package com.dolibarr.crm.producttest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Homepage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ModifyProductCardPage;
import com.comcast.crm.objectrepositoryutility.NewProductPage;
import com.comcast.crm.objectrepositoryutility.ProductInfoCardPage;
import com.comcast.crm.objectrepositoryutility.ProductsServicesPage;
/**
 * 
 * @author Rashmi
 * Product Test Class
 *
 */
public class ModifyProductTest extends BaseClass
{

	@Test
	public void verifyProductModificationWithAttributesTest() throws Throwable
	{
		/**
		 * 
		 * @author Rashmi
		 * Test Method to verify that Product 
		 * attributes can be  modified 
		 *
		 */
		
		/*Navigate to Products|Services tab*/
		Homepage hp=new Homepage(driver);
		hp.getProductsAndServiceslnk().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigated to Products|Services tab ");
		String atitle=driver.getTitle();
		Assert.assertEquals("Products and Services", atitle);
		Reporter.log("Navigated to Products|Services tab");
		
		/*Navigate to Create New Product page*/
		ProductsServicesPage psp=new ProductsServicesPage(driver);
		psp.getNewProductLnk().click();
		atitle=driver.getTitle();
		Assert.assertEquals("New product", atitle);
		UtilityClassObject.getTest().log(Status.INFO, "Navigated to Create New Product page ");
		Reporter.log("Navigated to Create New Product page");
		
		/*Fetch the data from excel*/
		NewProductPage npp=new NewProductPage(driver);
		ExcelUtility xutil=new ExcelUtility();
		JavaUtility jutil=new JavaUtility();
		String xcelproductRef=xutil.getDataFromExcel("PRODUCTS",1,2);
		int random=jutil.getRandomNumber();
		String productRef=xcelproductRef+random;
		String xcelLabel=xutil.getDataFromExcel("PRODUCTS",1,3);
		String label=xcelLabel+random;
		
		/*Create Product*/
		npp.createProduct(productRef, label);
		atitle=driver.getTitle();
		Assert.assertEquals("Product "+label+" - Card", atitle);
		ProductInfoCardPage pic=new ProductInfoCardPage(driver);
		UtilityClassObject.getTest().log(Status.INFO, "Navigated to Product info card page ");
		Reporter.log("Navigated to Product info card page ");
		String act_Prodref_label=pic.getProductRefInfo().getText();
		String act_label=pic.getProductLabelInfo().getText();
		String[] act_Prodref = act_Prodref_label.split("\n");
		
		/*Verify Product ref field for the newly created Product*/
		Assert.assertEquals(productRef, act_Prodref[0]);
		UtilityClassObject.getTest().log(Status.PASS, "Product "+productRef+" is created with Product ref "+productRef+"and label "+act_label);
		Reporter.log("Product "+productRef+" is created with Product ref "+productRef+"and label "+act_label);
		pic.getModifyProdBtn().click();
		atitle=driver.getTitle();
		Assert.assertEquals("Product "+label+" - Card", atitle);
		UtilityClassObject.getTest().log(Status.INFO, "Modify Product is called ");
		Reporter.log("Modify Product is called");
		ModifyProductCardPage mpc=new ModifyProductCardPage(driver);
		
		/*modify product weight*/
		String exp_weightnum=xutil.getDataFromExcel("PRODUCTS",1,4);
		String exp_units=xutil.getDataFromExcel("PRODUCTS",1,5);
		mpc.modifyWeight(exp_weightnum, exp_units);
		String act_weight=driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td")).getText();
		
		/*Verify modified  product weight in Product info page*/
		Assert.assertEquals((exp_weightnum+" "+exp_units),act_weight);
		UtilityClassObject.getTest().log(Status.PASS, "Product "+productRef+" is modified with weight "+act_weight);
		Reporter.log("Product "+productRef+" is modified with weight "+act_weight);
	}

}
