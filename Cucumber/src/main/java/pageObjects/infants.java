package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class infants {
	public WebDriver driver;
	public infants(WebDriver driver)
	{
		this.driver=driver;
	}
	inputsClass ic = new inputsClass();
	By infantsXpath = By.id("Infants");
	By infantsDD = By.xpath("//select[@id='Infants']//option");
	
	public WebElement infantClick()
	{
		return driver.findElement(infantsXpath);
	}
	public void infantselection() throws IOException
	{
		String desiredinfants = ic.infants();
		List<WebElement> aduDropdown = driver.findElements(infantsDD);
		for(int i=0; i<aduDropdown.size();i++)
		{
			String adText = aduDropdown.get(i).getText();
			if(adText.contains(desiredinfants))
			{
				aduDropdown.get(i).click();
			}
			aduDropdown = driver.findElements(infantsDD);
		}
	}
}
