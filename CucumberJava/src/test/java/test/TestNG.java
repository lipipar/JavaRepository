package test;
import org.testng.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class TestNG {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	      driver.manage().window().maximize();
	}
	
	@Test
	public void GoogleSearch()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		driver.quit();
		System.out.println("Test is passes successfully");
	}
}
