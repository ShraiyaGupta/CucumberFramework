package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;

public class TestBase {
	
	WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String url = properties.getProperty("QAUrl");
		
		if(driver == null)
		{
			if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
				{
					driver = new ChromeDriver();
					
				}
			if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				//firefox code
			}
			
			driver.get(url);
		
		}
		
		
		return driver;
	}

}
