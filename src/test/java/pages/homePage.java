package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	protected WebDriver driver;
	private By btn_Logout = By.id("logout");
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_Logout).isDisplayed();
	}

}
