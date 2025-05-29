package PageObjects;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Reusable;

public class CreateRFQFromOS extends BasePage {
	Reusable use=new Reusable(driver);

	public CreateRFQFromOS(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="#RFQSubject")
	WebElement RFQsubject;
	
	@FindBy(css="#rfqType1")
	WebElement single_radio;
	
	@FindBy(css="#rfqType2")
	WebElement period_radio;
	
	@FindBy(css="#ResponseDate")
	WebElement ResponseDate;
	
	@FindBy(css="#pStartDate")
	WebElement period_StartDate;
	
	@FindBy(css="#pEndDate")
	WebElement period_EndDate;
	
	
	@FindBy(css="#FIELD17")
	WebElement ReqyuiredDate;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement btn_RFQOK;
	

	public void createSingleRFQ() throws InterruptedException {
		use.frameSwitch("_dlgOpenerIframe1");
		RFQsubject.sendKeys("S&A");
		boolean singleissel=single_radio.isSelected();
		System.out.println(singleissel);
		ResponseDate.sendKeys("+1");
		ReqyuiredDate.sendKeys("+2");
		btn_RFQOK.click();
		Thread.sleep(5000);
		//use.isAlertPresent();
		use.acceptAlertIfPresent();
		
		
	}
	
	
	public void createPeriodRFQ() throws InterruptedException {
		use.frameSwitch("_dlgOpenerIframe1");
		RFQsubject.sendKeys("S&A");
		boolean periodissel=period_radio.isSelected();
		period_radio.click();
		System.out.println(periodissel);
		ResponseDate.sendKeys("+1");
		period_StartDate.sendKeys("+2");
		period_EndDate.sendKeys("+3");
		btn_RFQOK.click();
		Thread.sleep(5000);
		//use.isAlertPresent();
		use.acceptAlertIfPresent();
		
		
	}
	
	

}*/
