package locator;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class Registration extends DriverSetup {
	public static String baseurl = "https://www.amazon.com/";

	@Test
	public void amzaon() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*
		  // Notification Alert start from here 
		  ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--disable-notifications"); 
		  driver = new ChromeDriver(options);
		*/

		/*
		 * // Notification Alert start from here ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--disable-notifications"); driver =
		 * new ChromeDriver(options);
		 */

		// Create SignUp
		SignUp signup = new SignUp(driver);
		signup.clickOnSignIn();
		signup.createAmazonAccount();
		signup.userName("Zahangir");
		signup.emailFiled("demomail342@gmail.com");
		signup.passwordFiled("123456");
		signup.cnfrmPasswordFiled("123456");
		signup.contineBtn();
		Thread.sleep(10000);

	}
}
