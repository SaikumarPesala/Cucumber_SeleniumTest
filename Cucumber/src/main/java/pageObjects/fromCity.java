package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.inputsClass;

public class fromCity {
	public WebDriver driver;
	inputsClass ic = new inputsClass();

	public fromCity(WebDriver driver) {
		this.driver = driver;
	}

	By fromCity = By.id("FromTag");
	By cities = By.xpath("//ul[@id='ui-id-1']//li//a");

	public WebElement SrcFinder() {
		return driver.findElement(fromCity);
	}
	public String threeWordSource() throws IOException 
	{
		String city= ic.source();
		String threeWords = null;
		if(city.length()>=3)
		{
			threeWords = city.substring(0, 3);
		}
		return threeWords;
	}
	public void SrcSelection() throws IOException {
		int i = 0;
		List<WebElement> srcList = driver.findElements(cities);
		for (i = 0; i < srcList.size(); i++) {
			String src = srcList.get(i).getText();
			String[] name = src.split(",");
			String finalName = name[0].trim().toLowerCase();
			if (finalName.contains(ic.source().toLowerCase())) {
				srcList.get(i).click();
			}
		}
	}
}
