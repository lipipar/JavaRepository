package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		
		
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        ExtentTest test1 = extent.createTest("Test Case One","Testing Google Search Functionality");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	      driver.manage().window().maximize();
	      
	      test1.log(Status.INFO, "Starting TestCase");
	      driver.get("https://www.google.com");
	      test1.pass("Navigated to Google.com successfully");
	      
			driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
			test1.pass("Entered Text successfully");
			
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			 test1.pass("Pressed enter key");
			 
			driver.close();
			driver.quit();
			test1.pass("test passed successfully");
			test1.info(" Test Completed");
			extent.flush();

	}

}
