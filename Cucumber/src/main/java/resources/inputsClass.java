package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class inputsClass {
public Properties prop;
	
	public String browser() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("browser");
	}
	public String source() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("source");
	}
	public String destination() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("destination");
	}
	public String dateOfDeparture() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("dateOfDeparture");
	}
	public String adutls() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("adutls");
	}
	public String children() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("children");
	}
	public String infants() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("infants");
	}
	public String type() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\Cucumber\\src\\main\\java\\resources\\input.file");
		prop.load(fis);
		return prop.getProperty("type");
	}
}
