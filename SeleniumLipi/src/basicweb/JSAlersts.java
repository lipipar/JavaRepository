package basicweb;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlersts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		Boolean valid = driver.getPageSource().contains("You successfully clicked an alert");
		if(valid == true)
			System.out.println("You successfully clicked an alert");
		System.out.println("===================");
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		Boolean validconfirmalert = driver.getPageSource().contains("You clicked: Cancel");
		if(validconfirmalert == true)
			System.out.println("You clicked: Cancel");
		System.out.println("===================");
		
		driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Automation Step By Step");
		alert3.accept();
		
		Boolean validinput = driver.getPageSource().contains("You entered: Automation Step By Step");
		if(validinput == true)
			System.out.println("You entered: Automation Step By Step");
		System.out.println("===================");
		
		
		
		
		driver.close();
		driver.quit();
		

	}

}
