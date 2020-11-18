package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	public void departureDateSelection() throws IOException
	{
		String date = ic.dateOfDeparture();
		String [] seperatedDate = date.split(",");
		//String day = sepera;
	}
	public void main (String[] args)
	{
		String date = "23, November 2020";
		String[] seperatedDate = date.split(" ");
		System.out.println(seperatedDate[0]+" "+seperatedDate[1]);
		
				
	}
}
