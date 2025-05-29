package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import testBases.BaseClass;
import utilities.Reusable;

public class TC001_Login_Test extends BaseClass {

	public LoginPage login;

	//@Test(dataProvider="getData",dataProviderClass=DataProviderwithoutExcel.class)
	@Test
	public void LoginRun() throws InterruptedException {  // 1st Get value from config.prop
	
		//public void TestRun(String username,String pass,String sub) throws InterruptedException { // 1st Get value from Dataprovider class
		Reusable use = new Reusable(driver);
		logger.info("Browser Invoked....");
		login = new LoginPage(driver);
		logger.info("Entered Login Credential.....");
		//login.login(username,pass,sub); // 1st Get value from Dataprovider class
		login.login(p.getProperty("user"),p.getProperty("password"),p.getProperty("subID")); // // 1st Get value from config.prop
		login.submitLogin();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Birch Street");
		logger.info("Login successfully.....");
		driver.switchTo().defaultContent();
		use.frameSwitch("Logo");
		logger.info("Switch to Logo frame.....");
		comSwitch("863");
		logger.info("Switch to Company.....");
		login.acceptclose_btn();
		
		
		}
}


