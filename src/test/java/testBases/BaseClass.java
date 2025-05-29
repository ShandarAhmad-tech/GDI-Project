package testBases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger; //log4j
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BaseClass  {
	
	public Logger logger;
	public WebDriver driver;
	public Properties p;

	//@Parameters({"browser","URL"}) // 1st way to get value from xml file
	@BeforeClass
//@Parameters({ "browser" })
	//public void setupBrowser(String br,String url) throws IOException {// 1st way to get value from xml file
	
	public void setupBrowser() throws IOException // 2nd way to get value from config.prop file
	{
		ChromeOptions option=new ChromeOptions();
		option.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.EAGER);
		FileReader file = new FileReader(".\\src\\test\\resources\\config.properties");
		p = new Properties();
		p.load(file);
		logger = LogManager.getLogger(this.getClass());
		String br="chrome";
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver(option);
			break;
		case "firfox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Driver not supported");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url")); // 2nd way to get value from config.prop file
		//driver.get(url); //// 1st way to get value from xml file
		//driver.get("https://appqa.birchstreet.co/j4/login.jsp");
	}
	
	public void comSwitch(String com) {
		WebElement comopt=driver.findElement(By.id("compOptions"));
		comopt.click();
		Select opt=new Select(comopt);
		opt.selectByValue(com);
		
	}

	
//	 @AfterClass 
//	 public void browserClose() 
//	 { 
//		 driver.quit(); 
//		 }
	 
	
//	public String captureScreen(String tname) throws IOException {
//
//		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//				
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
//		File targetFile=new File(targetFilePath);
//		
//		sourceFile.renameTo(targetFile);
//			
//		return targetFilePath;
//
//	}

}
