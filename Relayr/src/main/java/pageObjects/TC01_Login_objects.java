package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01_Login_objects {

	public WebDriver driver;
	
	By login=By.xpath("//span[text()='log-in']");
	By Username=By.xpath("//*[@id='ch_login_email']");
	By password=By.xpath("//*[@id='ch_login_password']");
	By submit=By.xpath("//*[@id='ch_login_btn']");
	
	
	public TC01_Login_objects(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSubmitlogin()
	{
		return driver.findElement(submit);
	}
	
	
}
