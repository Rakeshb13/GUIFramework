package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAndPayments {
	WebDriver driver;
	public BillingAndPayments(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(linkText = "New invoice")
	private WebElement cus_NewInvoiceLink;
	
	@FindBy(linkText = "List")
	private WebElement cus_listLink;
	
	@FindBy(linkText = "List of templates")
	private WebElement cus_listOfTemplatesLink;
	
	@FindBy(linkText = "Payments")
	private WebElement cus_PaymentsLink;
	
	@FindBy(linkText = "Statistics")
	private WebElement cus_StatisticsLink;
	
	
	@FindBy(linkText = "New invoice")
	private WebElement ven_NewInvoiceLink;
	
	@FindBy(linkText = "List")
	private WebElement ven_listLink;
	
	@FindBy(linkText = "List of templates")
	private WebElement ven_listOfTemplatesLink;
	
	@FindBy(linkText = "Payments")
	private WebElement ven_PaymentsLink;
	
	@FindBy(linkText = "Statistics")
	private WebElement ven_StatisticsLink;
	
	
	
	

	
	public WebElement getCus_StatisticsLink() {
		return cus_StatisticsLink;
	}

	public WebElement getVen_NewInvoiceLink() {
		return ven_NewInvoiceLink;
	}

	public WebElement getVen_listLink() {
		return ven_listLink;
	}

	public WebElement getVen_listOfTemplatesLink() {
		return ven_listOfTemplatesLink;
	}

	public WebElement getVen_PaymentsLink() {
		return ven_PaymentsLink;
	}

	public WebElement getVen_StatisticsLink() {
		return ven_StatisticsLink;
	}
	
	public WebElement getCus_NewInvoiceLink() {
		return cus_NewInvoiceLink;
	}

	public WebElement getCus_listLink() {
		return cus_listLink;
	}

	public WebElement getCus_listOfTemplatesLink() {
		return cus_listOfTemplatesLink;
	}

	public WebElement getCus_PaymentsLink() {
		return cus_PaymentsLink;
	}
	
	
	
	
	
	
}
