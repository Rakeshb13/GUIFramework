package com.dolibarr.cr.servicetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.NewServicePage;

/*
 * @Author Rashmi
 * 
 * Test Scripts for Service module
 * 
 */
public class ServiceTest extends BaseClass{
	@Test
	public void deleteServiceTest()
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
				/*Navigate to Create New Service page*/
				NewServicePage nsp=new NewServicePage(driver);
				nsp.getCreateServiceBtn().click();
				
	}

}
