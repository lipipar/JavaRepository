package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PF {
	
	@FindBy(id="name")
	WebElement txt_Username;
	
	@FindBy(id="password")
	WebElement txt_Password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF()
	{
		
	}
	

}
