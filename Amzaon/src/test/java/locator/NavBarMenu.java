package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBarMenu {
	WebDriver driver = null;

	public NavBarMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnNavBar() {
		driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[2]/a[1]")).click();
	}
	
	public void best_Seller_InBaby() {
		driver.findElement(By.xpath("//div[contains(text(),\"Carhartt Men's Knit Cuffed Beanie\")]")).click();
	}
	
}
