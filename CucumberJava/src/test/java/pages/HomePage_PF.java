package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public HomePage_PF(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		//this refers to the current class you could either put LoginPage_PF.class
	}
	
	public void btnisDisplayed()
	{
		btn_logout.isDisplayed();
	}
}
