package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {

	WebDriver driver = null;

	@Before(value="@Smoke", order=1)
	public void browserSetup() {
		System.out.println("I am inside the browserSetup");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order=0)
	public void browserSetup2() {
		System.out.println("I am inside the browserSetup2");
		}
	
	@After(order=1)
	public void tearDown() {
		System.out.println("I am inside the tesrDown");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("I am inside the tesrDown2");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am inside the @beforeStep");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("I am inside the @AfterStep");
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {}

	@When("User enters valid username and password")
	public void User_enters_valid_username_and_password() {}

	@And("Clicks on login button")
	public void clicks_on_login_button() {}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {}

}
