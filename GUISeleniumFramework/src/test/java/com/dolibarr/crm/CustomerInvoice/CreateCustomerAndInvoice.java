package com.dolibarr.crm.CustomerInvoice;

import org.testng.annotations.Test;

import com.comcast.crm.objectrepositoryutility.Homepage;
import com.comcast.crm.objectrepositoryutility.NewCustomer;
import com.comcast.crm.objectrepositoryutility.ThirdParties;

public class CreateCustomerAndInvoice extends Customer_InvoiceTest {
	@Test
	public void createCustomerAndInvoice() {
		Homepage hP = new Homepage(driver);
		hP.getThirdpatry().click();
		ThirdParties tP = new ThirdParties(driver);
		tP.getNewthirdparty().click();
		NewCustomer nC = new NewCustomer(driver);
		
		
	}
	
}
