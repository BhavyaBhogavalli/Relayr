package Testing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.TC02_hotelObjects;
import resources.base;

public class TC02_navigateHotel extends base{
	public WebDriverWait s;
	
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void  initialize() throws IOException
	{
		Log.info("driver is initialized");
		driver=initializeDriver();
		
	}

	
	@Test
	public void hotelPageNavigation() throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		Log.info("Navigate to Make my trip hotel page");
		TC02_hotelObjects h= new TC02_hotelObjects(driver);
		h.getHotel().click();
		
		String text=driver.findElement(By.xpath("//*[@id='js-hp-widgetSection']/h1")).getText();
		
		if(text.equalsIgnoreCase("Book Domestic and International hotels"))
{
			Log.info("Successfully navigated to Hotel page");
			
}		
	}
 
	
 @AfterTest
 public void closeBrowser()
 {
	 driver.close();
 }
}
	

