package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class loginDemoSteps_POM {
/*
	WebDriver driver = null;
	loginPage login;
	
	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is on Login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}

	@When("^User enters (.*) & (.*)$")
	public void user_enters_un_pwd(String username, String password) throws InterruptedException {
		login = new loginPage(driver);
		//driver.findElement(By.id("name")).sendKeys(username);
		login.enterUsername(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		login.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("Clicks on Login")
	public void clicks_on_Login() throws InterruptedException {
		//driver.findElement(By.id("login")).click();
		login.clickLogin();
		Thread.sleep(2000);
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		//driver.findElement(By.id("logout")).isDisplayed();
		login.checkLogoutIsDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
*/
}
