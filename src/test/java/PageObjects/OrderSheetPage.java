package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Reusable;

public class OrderSheetPage extends BasePage {

	public OrderSheetPage(WebDriver driver) {
		super(driver);

	}
	Reusable use=new Reusable(driver);

	String partnumber = "000000000036255";
	String OSQty="5";

	@FindBy(css = ".selectize-input.items.has-options.full.has-items")
	WebElement list_loadOSlist;

	@FindBy(xpath = "//div[contains(text(),'*S&A')]")
	WebElement loadOsName;

	@FindBy(xpath = "//span[text()='Part #']/../../span/span")
	WebElement partFilter;

	@FindBy(css = ".ag-text-field-input")
	WebElement inputValue;
	
	@FindBy(xpath = "//button[contains(text(),'Apply Filter')]")
	WebElement clickOnapplyButton;
	

	@FindBy(css = "#QUANTITY0")
	WebElement enterOsQty;

	@FindBy(xpath = "//div[@class='ag-cell ag-cell-not-inline-editing ag-cell-auto-height editable-cell frontpageCellEditor ag-cell-value']")
	WebElement click_qtyField;
	
	@FindBy(css="#createRFQ")
	WebElement createRFQ_btn;

	public void loadOSlist() throws InterruptedException {
		
		use.actionMoveToElementandclick(list_loadOSlist);

	}

	public void predefinedOS() throws InterruptedException {
		loadOsName.click();
		Thread.sleep(2000);
	}

	public void clickonmenuTofilterPart() throws InterruptedException {
		   //selectpartrow.click();
          //osQtyGrid.click();
		Thread.sleep(2000);
		// partFilter.click();
		partFilter.click();

	}

	public void inputPartNumber() throws InterruptedException {
		Thread.sleep(2000);
		inputValue.click();
		inputValue.sendKeys(partnumber);

	}
	public void applyPartFilter() {
		clickOnapplyButton.click();
	}
	
	public void enterOSQty() throws InterruptedException {
		
		use.waitToElementclickable(click_qtyField);
		click_qtyField.click();
		enterOsQty.sendKeys(OSQty);
		
	}
	
	public void btn_createRFQ() {
		createRFQ_btn.click();
		
		
}

}
