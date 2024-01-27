package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetUp;

public class LandingPage {
	TestContextSetUp testContextSetUp;
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	
	
	public void searchProduct(String shortname)
	{
		driver.findElement(search).sendKeys(shortname);
	}
	
	public String getProductname()
	{
		return driver.findElement(productName).getText().split("-")[0].trim();
	}

	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	
	

}
