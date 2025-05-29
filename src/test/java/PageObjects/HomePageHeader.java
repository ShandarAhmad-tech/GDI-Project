package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHeader extends BasePage {

	public HomePageHeader(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()='Catalogs']")
	WebElement catalogclink;
	
	@FindBy(xpath = "//a[text()='Order Guide']")
	WebElement orderguideclick;
	
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cartclick;
	
	@FindBy(xpath = "//a[text()='REQ']")
	WebElement REQclick;
	
	@FindBy(xpath = "//a[text()='PO']")
	WebElement POclick;
	
	@FindBy(xpath = "//a[text()='In Box']")
	WebElement inBoxclick;
	
	@FindBy(xpath = "//a[text()='Approvals']")
	WebElement approvalsclick;
	
	@FindBy(xpath = "//a[text()='Supplier PO']")
	WebElement supplierPOclick;
	
	@FindBy(xpath = "//a[text()='RFQ']")
	WebElement RFQPOsclick;
	
	@FindBy(xpath = "//a[text()='AP Invoice']")
	WebElement apinvoicePOclick;
	
	@FindBy(xpath = "//a[text()='Menus']")
	WebElement menusclick;
	
	@FindBy(xpath = "//a[@id='tab21']")
	WebElement inventoryclick;
	
	@FindBy(xpath = "//a[text()='Recipes']")
	WebElement recipeclick;
	
	@FindBy(xpath = "//a[text()='Special Order Items']")
	WebElement soiclick;
	
	@FindBy(xpath = "//a[@id='tab37']")
	WebElement osclick;
	
	@FindBy(xpath = "//a[text()='VE Sandbox']")
	WebElement vesandboxlick;
	
	@FindBy(xpath = "//a[text()='Item List']")
	WebElement itemlistlick;
	
	@FindBy(xpath = "//a[text()='Transfer']")
	WebElement transferlick;
	
	@FindBy(xpath = "//a[text()='Plan REQ']")
	WebElement planREQlick;
	
	@FindBy(xpath = "//a[text()='Event Management']")
	WebElement eventManagementlick;                                                                
	
	@FindBy(xpath = "//img[@title='Hide Menu']")
	WebElement btnmainmenu;


	public void catalogTabclick() {
		catalogclink.click();
	}
	
	public void orderguideTabclick() {
		orderguideclick.click();
	}
	
	public void cartTabclick() {
		cartclick.click();
	}
	
	public void reqTabclick() {
		REQclick.click();
	}
	
	public void poTabclick() {
		POclick.click();
	}
	
	public void inboxTabclick() {
		inBoxclick.click();
	}
	
	public void approvalTabclick() {
		approvalsclick.click();
	}
	
	public void supplierTabclick() {
		supplierPOclick.click();
	}
	
	public void rfqTabclick() {
		RFQPOsclick.click();
	}
	
	public void apInvoiceTabclick() {
		apinvoicePOclick.click();
	}
	
	public void menusTabclick() {
		menusclick.click();
	}
	
	public void inventoryTabclick() {
		inventoryclick.click();
	}
	
	public void recipeTabclick() {
		recipeclick.click();
	}
	
	public void soiclick() {
	soiclick.click();
	}
	
	public void osTabclick() {
		
		osclick.click();
		}
	
	public void vesanboxTabclick() {
		vesandboxlick.click();
		}
	
	public void itemlistTabclick() {
		itemlistlick.click();
		}
	
	public void transferTabclick() {
		transferlick.click();
		}
	
	public void eventmanagemnetTabclick() {
		eventManagementlick.click();
		}
	
	
}
