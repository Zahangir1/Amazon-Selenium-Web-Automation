package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver = null;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnEmail(String text) {
		driver.findElement(By.id("ap_email")).sendKeys(text);
	}
	public void clickOnContinueBtn() {
		driver.findElement(By.id("continue")).click();
	}
	public void clickOnPassword(String text) {
		driver.findElement(By.id("ap_password")).sendKeys(text);
	}
	public void clickOnSigninBtn() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	public void toggleBar() {
		driver.findElement(By.id("nav-hamburger-menu")).click();
	}
}
