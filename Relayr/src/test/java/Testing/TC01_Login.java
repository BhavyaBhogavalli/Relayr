package Testing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.TC01_Login_objects;
import resources.base;

public class TC01_Login extends base{
	public WebDriverWait s;
	
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void  initialize() throws IOException
	{
		Log.info("driver is initialized");
		driver=initializeDriver();
		
	}

	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		Log.info("Navigate to Make my trip Home page");
		TC01_Login_objects l= new TC01_Login_objects(driver);
		l.getLogin().click();
		s = new WebDriverWait(driver,10);
		s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Log in']")));
		if(driver.findElement(By.xpath("//h2[text()='Log in']")).getText().equalsIgnoreCase("Log In"))
				{
			l.getUsername().sendKeys(Username);
			l.getPassword().sendKeys(Password);
			l.getSubmitlogin().click();
			
				}
		else
		{
			Log.info("page is not loaded");
		}
		
		Thread.sleep(5000L);	
	if(driver.findElement(By.xpath("//span[text()='Email and Password do not match.']")).getText().equalsIgnoreCase("Email and Password do not match."))
	{
			Log.info("User is not authorized");	
		}	
	else
	{
		Log.info("User is not authorized");	
	}
	  
	}
 @DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[1][2];
	//login with invalid credentials
	data[0][0]="abcd@gmail.com";
	data[0][1]="password_1234";
	
	return data; 
	
}
	
 @AfterTest
 public void closeBrowser()
 {
	 driver.close();
 }
}
	

