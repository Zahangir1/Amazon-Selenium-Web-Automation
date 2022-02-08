package test;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locator.NavBarMenu;
import locator.NotificationAlert;
import locator.SignIn;
import locator.SignUp;

public class AmazonWebAutomation extends DriverSetup {

	@Test
	public void amzaon() throws InterruptedException {
		driver.get(baseurl);
		logger.info("Url is opened");
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		//Notification Alert is start here...
//		NotificationAlert nAlert = new NotificationAlert();
//		nAlert.notification();
		
		// Create SignUp
		SignUp signup = new SignUp(driver);
		signup.clickOnSignIn();
		logger.info("Click on SignIn");
		// SignIn
		SignIn signin = new SignIn(driver);
		signin.clickOnEmail(username);
		logger.info("Entered E-mail");
		signin.clickOnContinueBtn();
		logger.info("Click on Continue Button");
		signin.clickOnPassword(password);
		logger.info("Entered Password");
		signin.clickOnSigninBtn();
		logger.info("Click on Sign Button");
		signin.toggleBar();
		logger.info("Click on Toggle Bar");
		// NavBar
		
	}
	
	@Test
	public void amzonBestSeller() throws InterruptedException {
		NavBarMenu navbar = new NavBarMenu(driver);
		navbar.clickOnNavBar();
		logger.info("Click on NavBar");
		navbar.best_Seller_InBaby();
		logger.info("Amazon Best Seller and Accessories");
		Thread.sleep(10000);
	}

}
