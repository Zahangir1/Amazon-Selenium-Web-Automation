package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver= driver;
	}
	public void clickOnSignIn() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	} 
	public void createAmazonAccount() {
		driver.findElement(By.id("createAccountSubmit")).click();
	} 
	public void userName(String text) {
		driver.findElement(By.name("customerName")).sendKeys(text);
	}
	public void emailFiled(String text) {
		driver.findElement(By.name("email")).sendKeys(text);
	}
	public void passwordFiled(String text) {
		driver.findElement(By.name("password")).sendKeys(text);
	}
	public void cnfrmPasswordFiled(String text) {
		driver.findElement(By.name("passwordCheck")).sendKeys(text);
	}
	public void contineBtn() {
		driver.findElement(By.id("continue")).click();
	}
	
	
}
