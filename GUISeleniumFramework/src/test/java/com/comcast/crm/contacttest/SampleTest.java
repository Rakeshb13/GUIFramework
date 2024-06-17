package com.comcast.crm.contacttest;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.BillingAndPayments;
import com.comcast.crm.objectrepositoryutility.Homepage;
/**
 * 
 * @author Deepak
 *
 */
public class SampleTest extends BaseClass {

	//@Test(groups = {"smokeTest"})
	@Test
	public void createConTactTest() throws Throwable {		
		/* read testScritp data from Excel file*/
		//String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();
		Homepage hp=new Homepage(driver);
		hp.getBillingAndPaymnets().click();
		Thread.sleep(3000);
	//	BillingAndPayments bp = new BillingAndPayments(driver);
		

	
	}

}
