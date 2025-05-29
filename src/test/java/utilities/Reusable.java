package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBases.BaseClass;

public class Reusable extends BaseClass {

	WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public Reusable(WebDriver driver) {
		this.driver = driver;
	}

	public void frameSwitch(String fname) {

		WebElement frame1 = driver.findElement(By.name(fname));
		driver.switchTo().frame(frame1);

	}

	public void frameSwitchWait(String fname) {

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fname));

	}

	public void actionMoveToElementandclick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		

	}
	
	public boolean isAlertPresent()
	{
		boolean foundAlert=false;
		try{
			wait.until(ExpectedConditions.alertIsPresent());
		foundAlert=true;
		}
		catch(org.openqa.selenium.TimeoutException eTO) {
			foundAlert=false;
		}
		return foundAlert;
		
	}
	
	public void acceptAlertIfPresent() {
		//if(isAlertPresent()==true) {
		Alert alert = driver.switchTo().alert(); 
		alert.accept();}
	//}
	
	
	public void waitToElementclickable(WebElement clickEle) {
		wait.until(ExpectedConditions.elementToBeClickable(clickEle));
	}
	
	public void waitToElementAppear(WebElement appearele) {
		wait.until(ExpectedConditions.visibilityOfAllElements(appearele));
	}

	public void clearTextfield(String clearEle) {
		driver.findElement(By.xpath(clearEle)).clear();
	}

}






