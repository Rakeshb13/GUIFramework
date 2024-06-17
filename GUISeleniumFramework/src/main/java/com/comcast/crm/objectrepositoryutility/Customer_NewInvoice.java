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
	
	@FindBy(xpath = "//span[text()='Select a third party'][1]")
	private WebElement CustomerDropdown;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement CustomerTextField;
	
	@FindBy(id = "radio_standard")
	private WebElement standardRadioButton;
	
	@FindBy(id = "reButtonNow")
	private WebElement invoiceDate;
	
	@FindBy(id = "select2-cond_reglement_id-container")
	private WebElement paymentTermDropdown;
	
	@FindBy(id = "select2-selectmode_reglement_id-container")
	private WebElement paymentMethodDropdown;
	
	@FindBy(id = "note_public")
	private WebElement notePublic;
	
	@FindBy(xpath = "//input[@value='Create draft']")
	private WebElement CreateDraftBtn;
	
	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement CancelBtn;
	
	@FindBy(xpath = "//div[contains(text(),'PROV')]")
	private WebElement InvoiceRef;

	public WebElement getInvoiceRef() {
		return InvoiceRef;
	}

	public WebElement getCustomerDropdown() {
		return CustomerDropdown;
	}
	
	public WebElement getCustomerTextField() {
		return CustomerTextField;
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
	public WebElement getPaymentMethodDropdown() {
		return paymentMethodDropdown;
	}
	
}
