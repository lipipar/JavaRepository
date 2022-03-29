package basicweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class WebElementTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Testing Keys on Google Chrome
//				String url = "https://www.google.com"; 
//				
//				//Launch the ToolsQA WebSite 
//				driver.get(url); 
//				WebElement searchbox = driver.findElement(By.name("q"));
//				searchbox.sendKeys("ABCD",Keys.ENTER);
//				Thread.sleep(2000);
//				driver.close();
//				driver.quit();
		
		//Testing other Webelements
		String url = "https://trytestingthis.netlify.app/";
		driver.get(url);
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options)
		{
			System.out.println(element.getText());
		}
		WebElement csselement = driver.findElement(By.cssSelector("#fname"));
		csselement.sendKeys("lipi");
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		
		
		if (radiobtn.isSelected()== false) {
			radiobtn.click();
            System.out.println("RadioButton is Toggled On");					

        } 
		
		
		WebElement selectbox = driver.findElement(By.id("option"));
		Select select = new Select(selectbox);
		select.selectByValue("option 2");
		
		WebElement checkbox1 = driver.findElement(By.id("moption"));
		if (checkbox1.isSelected()== false) {
			checkbox1.click();
            System.out.println("Checkbox is Toggled On");					

        } 
		
		
		
		
		//To use Relative locators
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
//		WebElement bttn = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginbutton));
//		bttn.sendKeys("ABCD");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
