package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.*;

import resources.Base;

public class LoginTest extends Base{

	public WebDriver driver;
	@Test(dataProvider="getdata")

	public void login(String email, String password) throws IOException, InterruptedException
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));

		LandingPage lp= new LandingPage(driver);
		lp.accountType().click();
		lp.login().click();

		LoginPage login = new LoginPage(driver);
		login.email().sendKeys(email);
		login.password().sendKeys(password);
		login.submit().click();

		AccountPage ap = new AccountPage(driver);

		String txt = ap.accountwelcomepage().getText();

		System.out.println("prtinting Account text:   "+txt);

		if(txt=="Account") {
			System.out.println("successfully logged in");
		}
		else {
			File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("files//screenshot1.png"));
		}


		ap.myaccountmenu().click();
		Thread.sleep(1000);
		ap.logout();


	}


	@AfterMethod
	public void closebrowser() {
		driver.close();
	}


	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];
		data[0][0]= "sureshkumar1@gmail.com";
		data[0][1]= "james123";
		data[1][0]= "sureshkumar2@gmail.com";
		data[1][1]= "james234";
		
		return data;
	}
}

