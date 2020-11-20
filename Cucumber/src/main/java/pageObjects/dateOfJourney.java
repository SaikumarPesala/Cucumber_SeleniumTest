package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class dateOfJourney {
	public WebDriver driver;
	public dateOfJourney(WebDriver driver)
	{
		this.driver=driver;
	}
	inputsClass ic = new inputsClass();
	By firMonth = By.xpath("//div[@class='monthBlock first']//span[@class='ui-datepicker-month']");
	By secMonth = By.xpath("//div[@class='monthBlock last']//span[@class='ui-datepicker-month']");
	By year = By.xpath("//div[@class='monthBlock first']//span[@class='ui-datepicker-year']");
	
	public void departureDateSelection() throws IOException
	{
		String date = ic.dateOfDeparture();
		String desiredDay, desiredMonth, fullMonth1 = null, fullMonth2 = null, desiredYear, calYear;
		String [] seperatedDate = date.split(" ");
		desiredDay = seperatedDate[0];
		desiredMonth = seperatedDate[1].toLowerCase();
		desiredYear = seperatedDate[2];
		int g=1;
		while(g==1)
		{
			fullMonth1 = driver.findElement(firMonth).getText().toLowerCase();
			fullMonth2 = driver.findElement(secMonth).getText().toLowerCase();
			calYear = driver.findElement(year).getText();
			if((fullMonth1.contains(desiredMonth)) || (fullMonth2.contains(desiredMonth)))
			{
				if(calYear.contains(desiredYear))
				{
					g=0;
				}
			}
			else
			{
				driver.findElement(By.xpath("//div[contains(@class,'last')]//div[@class='header']//a")).click();
			}
		 }
		if(fullMonth1.contains(desiredMonth))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@id,'datepicker')]//div[contains(@class,'first')]//table//tbody//tr//td//a"));
			for(int k=0;k<dates.size();k++)
			{
				String dateSel = dates.get(k).getText();
				if(dateSel.contains(desiredDay))
				{
					dates.get(k).click();
				}
				dates = driver.findElements(By.xpath("//div[contains(@id,'datepicker')]//div[contains(@class,'first')]//table//tbody//tr//td//a"));
			}
		}
		if(fullMonth2.contains(desiredMonth))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@id,'datepicker')]//div[contains(@class,'last')]//table//tbody//tr//td//a"));
			for(int k=0;k<dates.size();k++)
			{
				String dateSel = dates.get(k).getText();
				if(dateSel.contains(desiredDay))
				{
					dates.get(k).click();
				}
				dates = driver.findElements(By.xpath("//div[contains(@id,'datepicker')]//div[contains(@class,'last')]//table//tbody//tr//td//a"));
			}
		}
	}

}
