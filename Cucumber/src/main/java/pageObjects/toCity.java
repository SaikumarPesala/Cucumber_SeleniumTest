package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class toCity {
	public WebDriver driver;
	inputsClass ic = new inputsClass();
	public toCity(WebDriver driver) 
	{
		this.driver = driver;
	}
	By destFind = By.id("ToTag");
	By destNamesLists = By.xpath("//ul[@id='ui-id-2']//li//a");
	
	
	public WebElement destFinder() 
	{
		return driver.findElement(destFind);
	}
	
	public void desiredDesti() throws IOException
	{
		List<WebElement> destNames = driver.findElements(destNamesLists);
		for(int j=0;j<destNames.size();j++)
		{
			String destName = destNames.get(j).getText();
			String[] sepDestName = destName.split(",");
			String actDestName = sepDestName[0];
			String trimmedDestName = actDestName.trim().toLowerCase();
			if(trimmedDestName.contains(ic.destination()))
			{
				destNames.get(j).click();
			}
			
		}
	}
}
