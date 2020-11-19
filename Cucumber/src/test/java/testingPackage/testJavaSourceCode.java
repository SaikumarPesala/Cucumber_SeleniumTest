package testingPackage;
import pageObjects.*;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.baseClass;

public class testJavaSourceCode extends baseClass{
	public WebDriver driver;
	@Test
	public void URL() throws IOException
	{
		driver = initialiseDriver();
		driver.get("https://www.cleartrip.com");
	}
	@Test
	public void citiesSelection() throws IOException
	{
		fromCity fc = new fromCity(driver);
		fc.SrcFinder().click();
		fc.SrcFinder().sendKeys(fc.threeWordSource());
		fc.SrcSelection();
		toCity tc = new toCity(driver);
		tc.destFinder().sendKeys(tc.destiThreeWords());
		tc.desiredDesti();
	}
	
}
