package com.dolibarr.crm.producttest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ModifyProductCardPage;
import com.comcast.crm.objectrepositoryutility.NewProductPage;
import com.comcast.crm.objectrepositoryutility.ProductInfoCardPage;
import com.comcast.crm.objectrepositoryutility.ProductsServicesPage;

public class ProductTest extends BaseClass {

	@Test
	public void modifyProductTest() throws Throwable
	{
		//LoginPage lp=new LoginPage(driver);
		//lp.login("http://49.249.28.218:8889/dolibarr/", "admin","admin123");
		driver.get("http://49.249.28.218:8889/dolibarr/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*Navigate to Products|Services tab*/
		driver.findElement(By.linkText("Products | Services")).click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigated to Products|Services tab ");
		/*Navigate to Create New Product page*/
		ProductsServicesPage psp=new ProductsServicesPage(driver);
		psp.getNewProductLnk().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create New Product page ");
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
		ProductInfoCardPage pic=new ProductInfoCardPage(driver);
		String act_Prodref_label=pic.getProductRefInfo().getText();
		String act_label=pic.getProductLabelInfo().getText();
		String[] act_Prodref = act_Prodref_label.split("\n");
		/*Verify Product ref field for the newly created Product*/
		Assert.assertEquals(productRef, act_Prodref[0]);
		UtilityClassObject.getTest().log(Status.PASS, "Product "+productRef+" is created with Product ref "+productRef+"and label "+act_label);
		pic.getModifyProdBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Modify Product is called ");
		ModifyProductCardPage mpc=new ModifyProductCardPage(driver);
		/*modify product weight*/
		String exp_weightnum=xutil.getDataFromExcel("PRODUCTS",1,4);
		String exp_units=xutil.getDataFromExcel("PRODUCTS",1,5);
		mpc.modifyWeight(exp_weightnum, exp_units);
		String act_weight=driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td")).getText();
		/*Verify modified  product weight in Product info page*/
		Assert.assertEquals((exp_weightnum+" "+exp_units),act_weight);
		UtilityClassObject.getTest().log(Status.PASS, "Product "+productRef+" is modified with weight "+act_weight);
	}

}
