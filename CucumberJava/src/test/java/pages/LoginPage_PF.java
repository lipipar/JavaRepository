package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	
	@FindBy(id="name")
	WebElement txt_Username;
	
	@FindBy(id="password")
	WebElement txt_Password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		//this refers to the current class you could either put LoginPage_PF.class
	}
	
  public void enterUserName(String username)
  {
	  txt_Username.sendKeys(username);
  }
  
  public void enterPassword(String password)
  {
	  txt_Password.sendKeys(password);
  }
  
  public void clickonLogin()
  {
	  btn_login.click();
  }
}
