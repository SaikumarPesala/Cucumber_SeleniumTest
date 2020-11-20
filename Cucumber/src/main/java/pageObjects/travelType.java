package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class travelType {
	public WebDriver driver;
	public travelType(WebDriver driver)
	{
		this.driver=driver;
	}
	inputsClass ic = new inputsClass();
	By type = By.xpath("//div[contains(@id,'Options')]//i[contains(@class,'blue')]");
	By option = By.id("Class");
	
	public WebElement typeClick()
	{
		return driver.findElement(type);
	}
	
	public WebElement classSelectClick()
	{
		return driver.findElement(option);
	}
	
	public void typeSelection() throws IOException
	{
		String desiredType = ic.type().toLowerCase();
		List<WebElement> types = driver.findElements(By.xpath("//select[@id='Class']//option"));
		for(int i=0;i<types.size();i++)
		{
			if((types.get(i).getText().toLowerCase()).contains(desiredType))
			{
				types.get(i).click();
			}
			types = driver.findElements(By.xpath("//select[@id='Class']//option"));
		}
	}

}
