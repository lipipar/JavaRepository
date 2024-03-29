package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver= null;
	

	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.xpath("//*[@id=\"login\"]");
	By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void logoutDisplayed()
	{
		driver.findElement(btn_logout).isDisplayed();
	}
	
	

	
}
