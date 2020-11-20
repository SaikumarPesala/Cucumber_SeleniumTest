package testingPackage;
import pageObjects.*;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.baseClass;

public class testJavaSourceCode extends baseClass{
	public WebDriver driver;
	@Test
	public void a_URL() throws IOException
	{
		driver = initialiseDriver();
		driver.get("https://www.cleartrip.com");
	}
	@Test
	public void b_sourceCity() throws IOException
	{
		fromCity fc = new fromCity(driver);
		fc.SrcFinder().click();
		fc.SrcFinder().sendKeys(fc.threeWordSource());
		fc.SrcSelection();
	}
	@Test
	public void c_destinationCity() throws IOException
	{
		toCity tc = new toCity(driver);
		tc.destFinder().sendKeys(tc.destiThreeWords());
		tc.desiredDesti();
	}
	@Test
	public void d_dateOfTravel() throws IOException
	{
		dateOfJourney dj = new dateOfJourney(driver);
		dj.departureDateSelection();
	}
	@Test
	public void e_adults() throws IOException 
	{
		adults ad = new adults(driver);
		ad.adultClick();
		ad.adultSelection();
	}
	@Test
	public void f_childrens() throws IOException
	{
		childrens ch = new childrens(driver);
		ch.childrenClick();
		ch.childrenselection();
	}
	@Test
	public void g_infants() throws IOException
	{
		infants inf = new infants(driver);
		inf.infantClick();
		inf.infantselection();
	}
	@Test
	public void h_travelType() throws IOException 
	{
		travelType tt = new travelType(driver);
		tt.typeClick().click();
		tt.classSelectClick().click();
		tt.typeSelection();
		
	}
}
