package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor_NewInvoice {
	WebDriver driver ;
	public Vendor_NewInvoice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select2-socid-container")
	private WebElement VendorDropdown;
	
	@FindBy(xpath = "//input[@name='ref_supplier']")
	private WebElement Supp_InvoiceRefText;
	
	@FindBy(id = "radio_standard")
	private WebElement standardRadioButton;
	
	@FindBy(id = "reButtonNow")
	private WebElement invoiceDate;
	
	public WebElement getSupp_InvoiceRefText() {
		return Supp_InvoiceRefText;
	}

	@FindBy(id = "select2-cond_reglement_id-container")
	private WebElement paymentTermDropdown;
	
	@FindBy(id = "note_public")
	private WebElement notePublic;
	
	@FindBy(xpath = "//input[@value='Create draft']")
	private WebElement CreateDraftBtn;
	
	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement CancelBtn;

	public WebElement getVendorDropdown() {
		return VendorDropdown;
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
