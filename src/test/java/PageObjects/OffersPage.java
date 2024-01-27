package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetUp;

public class OffersPage {
	
	public WebDriver driver;
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By topDeals = By.linkText("Top Deals");
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("tr td:nth-child(1)");
	
	
	public void clickTopDeals() {
		driver.findElement(topDeals).click();
	}
	
	public void searchProduct(String shortname) {
		driver.findElement(search).sendKeys(shortname);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}

}
