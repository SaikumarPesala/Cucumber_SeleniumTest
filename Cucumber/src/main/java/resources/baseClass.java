package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass {
	public WebDriver driver;
	public  WebDriver initialiseDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTripNew\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		String browser = prop.getProperty("browser");		
		if(browser.contains("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"F:\\other\\Softwares\\Selenium WebDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(co);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
