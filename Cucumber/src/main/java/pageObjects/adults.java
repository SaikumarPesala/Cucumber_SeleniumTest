package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class adults {
	public WebDriver driver;
	public adults(WebDriver driver)
	{
		this.driver=driver;
	}
	inputsClass ic = new inputsClass();
	By adultsXpath = By.id("Adults");
	By adultsDD = By.xpath("//select[@id='Adults']//option");
	
	public WebElement adultClick()
	{
		return driver.findElement(adultsXpath);
	}
	public void adultSelection() throws IOException
	{
		String desiredAdutls = ic.adutls();
		List<WebElement> aduDropdown = driver.findElements(adultsDD);
		for(int i=0; i<aduDropdown.size();i++)
		{
			String adText = aduDropdown.get(i).getText();
			if(adText.contains(desiredAdutls))
			{
				aduDropdown.get(i).click();
			}
			aduDropdown = driver.findElements(adultsDD);
		}
	}
}
