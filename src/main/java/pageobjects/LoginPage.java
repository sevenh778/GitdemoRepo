package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
    WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public WebElement email() {
		return email;
	}
	public WebElement password() {
		return password;
	}
	public WebElement submit() {
		return submit;
	}
	
}
