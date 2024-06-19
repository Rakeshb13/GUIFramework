package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.BaseClass;

/*
 * Authot :Rashmi
 * POM class for missing web elements
 * 
 */
public class ExtraElementsInPage extends BaseClass{

	@FindBy(xpath="//input[contains(@id,'amount')]")
	private WebElement paymentAmountTbx;

	@FindBy(linkText="New Vendor")
	private WebElement newVendorLnk;

	@FindBy(xpath="//a[text()='Vendor invoices']/parent::*/parent::*/descendant::a[text()='New invoice']")
	private WebElement newVendorInvoiceLnk;

	@FindBy(xpath="//span[@title='Select a third party']")
	private WebElement vendorTbx;

	@FindBy(xpath="//input[@type='search']")
	private WebElement vendorInputBox;

	@FindBy(xpath="//div[@class='refidno']/parent::div")
	private WebElement venInvoiceInfo;
	
	@FindBy(xpath="//div[@class='statusref']/span")
	private WebElement invoiceStatusInfo;

	@FindBy(id="select2-idprodfournprice-container")
	private WebElement productDropdown;

	@FindBy(xpath="//input[@aria-controls='select2-idprodfournprice-results']")
	private WebElement productTbx;

	@FindBy(xpath="//div[@class='ui-dialog-buttonset']/button[text()='Yes']")
	private WebElement dialogYesBtn;


	@FindBy(id="addline")
	private WebElement addLineBtn;

	@FindBy(xpath="//input[@value='Validate']")
	private WebElement validatePayBtn;
	@FindBy(xpath="//a[text()='Validate']")
	private WebElement validateBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Classify')]")
	private WebElement classifyPaidBtn;
	
	@FindBy(xpath="//a[text()='Customer invoices']/parent::*/parent::*/descendant::a[text()='New invoice']")
	private WebElement newCustInvoiceLnk;
	
	@FindBy(id="select2-selectpaiementcode-container")
	private WebElement paymentMethodDropDwn;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[text()='Credit card']")
	private WebElement creditCardOption;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[text()='10 days of month-end']")
	private WebElement paymentTermOption;
	
	@FindBy(id="confirm")
	private WebElement confirmPaymentDrpDwn;
	
	public WebElement getConfirmPaymentDrpDwn()
	{
		return confirmPaymentDrpDwn;
	}
	
	public WebElement getPaymentAmountTbx()
	{
		return paymentAmountTbx;
	}
	public WebElement getCreditCardOption()
	{
		return creditCardOption;
	}
	
	public WebElement getPaymentMethodDropDwn()
	{
		return paymentMethodDropDwn;
	}
	
	
	public ExtraElementsInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getNewCustInvoiceLnk()
	{
		return newCustInvoiceLnk;
	}
	
	public WebElement getPaymentTermOption()
	{
		return paymentTermOption;
	}
	public WebElement getValidatePayBtn()
	{
		return validatePayBtn;
	}
	public WebElement getValidateBtn()
	{
		return validateBtn;
	}


	public WebElement getVenInvoiceInfo()
	{
		return venInvoiceInfo;
	}
	public WebElement getVendorInputBox()
	{
		return vendorInputBox;
	}

	public WebElement getNewVendor()
	{
		return newVendorLnk;
	}

	public WebElement getNewVendorInvoiceLnk()
	{
		return newVendorInvoiceLnk;
	}
	public WebElement getVendorTbx()
	{
		return vendorTbx;
	}
	public WebElement getProductDropDown()
	{
		return productDropdown;

	}
	public WebElement getProductTbx()
	{
		return productTbx;

	}

	public WebElement getAddlineBtn()
	{
		return addLineBtn;
	}

	public WebElement getDialogYesBtn()
	{
		return dialogYesBtn;
	}
	
	public WebElement getInvoiceStatusInfo()
	{
		return invoiceStatusInfo;
	}
	
	public WebElement getClassifyPaidBtn()
	{
		return classifyPaidBtn;
	}
	
	
}
