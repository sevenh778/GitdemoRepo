package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(css="a[title='My Account'] span[class='hidden-xs hidden-sm hidden-md']")
	WebElement accountType;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;
	public WebElement login() 
	{
		return login;
	}
	public WebElement accountType()
	{
		return accountType;
	}
	
	}
