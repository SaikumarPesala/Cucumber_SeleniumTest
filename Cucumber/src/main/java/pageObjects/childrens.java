package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class childrens {
	public WebDriver driver;
	public childrens(WebDriver driver)
	{
		this.driver=driver;
	}
	inputsClass ic = new inputsClass();
	By childrensXpath = By.id("Childrens");
	By childrensDD = By.xpath("//select[@id='Childrens']//option");
	
	public WebElement childrenClick()
	{
		return driver.findElement(childrensXpath);
	}
	public void childrenselection() throws IOException
	{
		String desiredchildrens = ic.children();
		List<WebElement> aduDropdown = driver.findElements(childrensDD);
		for(int i=0; i<aduDropdown.size();i++)
		{
			String adText = aduDropdown.get(i).getText();
			if(adText.contains(desiredchildrens))
			{
				aduDropdown.get(i).click();
			}
			aduDropdown = driver.findElements(childrensDD);
		}
	}
}
