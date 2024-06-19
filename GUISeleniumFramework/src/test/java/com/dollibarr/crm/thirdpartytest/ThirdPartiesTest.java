package com.dollibarr.crm.thirdpartytest;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.objectrepositoryutility.NewCustomer;


public class ThirdPartiesTest extends BaseClass {
	
	
	@Test
	public void newCustomerTest() throws Throwable {
	
	
	//random number generation
	JavaUtility ju=new JavaUtility();
		
	ExcelUtility eu=new ExcelUtility();
	
	
		
	//navigate to third parties customer
	
	NewCustomer tp=new NewCustomer(driver);
	int random=ju.getRandomNumber();
	String thirdpartyname=eu.getDataFromExcel("THIRDPARTY",1,1);
	thirdpartyname=thirdpartyname+random;
	tp.newThirdPartyCustomer(thirdpartyname);
	}
}
	
	
	
	
	


