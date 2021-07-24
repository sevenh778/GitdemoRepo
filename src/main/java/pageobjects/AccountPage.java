package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	public WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Account")
	WebElement accountwelcomepage;
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccountmenu;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	WebElement logout;
	public WebElement accountwelcomepage() {
		return accountwelcomepage;
	}
	public WebElement myaccountmenu() {
		return myaccountmenu;
	}
	public void logout() {
		Actions a = new Actions(driver);
		//a.click(logout).build().perform();
		a.moveToElement(logout).click().build().perform();
		
	}

}
