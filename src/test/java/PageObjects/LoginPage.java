package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Reusable;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}


	Reusable use = new Reusable(driver);
	@FindBy(id = "loginID")
	WebElement input_login;

	@FindBy(id = "password")
	WebElement input_password;

	@FindBy(id = "subscriberID")
	WebElement input_subid;

	@FindBy(id = "submitLogin")
	WebElement btn_submit;

	@FindBy(xpath = "//a[text()='Accept & Close']")
	WebElement click_AcceptandClose;

	public void login(String user, String pass, String subid) {

		input_login.sendKeys(user);
		input_password.sendKeys(pass);
		input_subid.sendKeys(subid);
	}

	public void submitLogin() {
		btn_submit.click();

	}

	public void acceptclose_btn() {
		driver.switchTo().defaultContent();
		use.frameSwitch("EntryScreen");
		use.waitToElementAppear(click_AcceptandClose);
		click_AcceptandClose.click();
	}

}
