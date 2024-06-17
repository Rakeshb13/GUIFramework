package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_NewInvoice {
	WebDriver driver ;
	public Customer_NewInvoice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select2-socid-container")
	private WebElement CustomerDropdown;
	
	@FindBy(id = "radio_standard")
	private WebElement standardRadioButton;
	
	@FindBy(id = "ui-datepicker-trigger")
	private WebElement invoiceDate;
	
	@FindBy(id = "select2-cond_reglement_id-container")
	private WebElement paymentTermDropdown;
	
	@FindBy(id = "note_public")
	private WebElement notePublic;
	
	@FindBy(xpath = "//input[@value='Create draft']")
	private WebElement CreateDraftBtn;
	
	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement CancelBtn;

	public WebElement getCustomerDropdown() {
		return CustomerDropdown;
	}

	public WebElement getStandardRadioButton() {
		return standardRadioButton;
	}

	public WebElement getInvoiceDate() {
		return invoiceDate;
	}

	public WebElement getPaymentTermDropdown() {
		return paymentTermDropdown;
	}

	public WebElement getNotePublic() {
		return notePublic;
	}

	public WebElement getCreateDraftBtn() {
		return CreateDraftBtn;
	}

	public WebElement getCancelBtn() {
		return CancelBtn;
	}
	
}
