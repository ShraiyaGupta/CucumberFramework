package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void switchToChildPage() {
		Set<String> winHandlesSet = driver.getWindowHandles();
		Iterator<String> i1 = winHandlesSet.iterator();
		String parentHandleString = i1.next();
		String childHandleString = i1.next();
		driver.switchTo().window(childHandleString);
	}

}
