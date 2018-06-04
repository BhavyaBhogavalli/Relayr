package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC02_hotelObjects {

	public WebDriver driver;
	
	By hotelpage=By.xpath("//a[@id='header_tab_hotels']");
		
	public TC02_hotelObjects(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getHotel()
	{
		return driver.findElement(hotelpage);
	}

	
	
	
	
}
