package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("^Browser is open$")
	public void Browser_is_open() {
		System.out.println("Browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}

	@And("User is on google search page")
	public void User_is_on_google_search_page() throws InterruptedException {
		System.out.println("User is on google search page");
		driver.get("https://google.co.in/");
		Thread.sleep(2000);
		if (driver.findElements(By.id("L2AGLb")).size()>0) {
			driver.findElement(By.id("L2AGLb")).click();
			Thread.sleep(2000);
		}
	}

	@When("User enters a search text in search box")
	public void User_enters_a_search_text_in_search_box() throws InterruptedException {
		System.out.println("User enters a search text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(2000);
	}

	@And("Hits a enter")
	public void Hits_a_enter() throws InterruptedException {
		System.out.println("Hits a enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User is navigated to search results")
	public void User_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("User is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	 
}
