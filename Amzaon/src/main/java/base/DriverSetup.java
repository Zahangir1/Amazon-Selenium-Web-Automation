package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;
	
	public static Logger logger;
	public static String baseurl = "https://www.amazon.com/";
	public String username = "demomail342@gmail.com";
	public String password = "123456";

	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("Amazon");
		PropertyConfigurator.configure("Log4j.properties");

	}
	
	@AfterSuite
	public void tearDown() {
		//driver.close();
		driver.quit();
	}
}
