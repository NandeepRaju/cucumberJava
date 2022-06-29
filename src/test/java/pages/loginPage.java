package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	protected WebDriver driver;

	private By txtBox_UserName = By.id("name");
	private By txtBox_Password = By.id("password");
	private By btn_Login = By.id("login");
	private By btn_Logout = By.id("logout");

	public loginPage(WebDriver driver) {
		this.driver = driver;	
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login Page. The current page is: "+driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txtBox_UserName).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txtBox_Password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_Login).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_Logout).isDisplayed();
	}

	public void validLogin(String username, String password) {
		driver.findElement(txtBox_UserName).sendKeys(username);
		driver.findElement(txtBox_Password).sendKeys(password);
		driver.findElement(btn_Login).click();
	}
}
