package resources;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class base {
	public WebDriver driver;
	public Properties prop;
			
	public WebDriver initializeDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\IBM_ADMIN\\Relayr\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser=="chrome")
		{
			//execute in chrome
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users//IBM_ADMIN//Desktop//Cources//Selenium//geckodriver.exe" );
			   driver = new FirefoxDriver();
		}
		else if(browser=="ie")
		{
	//execute in IE
	}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	}

