package StepDefinitions;
import pages.LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo_POM {
WebDriver driver;
LoginPage lpage;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\lib\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      driver.manage().window().maximize();
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password) throws InterruptedException  {
	  lpage = new LoginPage(driver);
	  lpage.enterUserName(username);
	  lpage.enterPassword(password);
	   Thread.sleep(2000);
	   
	   
	}
	
	@And("clicks on login")
	public void clicks_on_login() {
		lpage.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		lpage.logoutDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
}
}
