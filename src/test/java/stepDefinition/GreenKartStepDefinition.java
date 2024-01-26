package stepDefinition;

import static org.testng.Assert.*;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GreenKartStepDefinition {
	
	WebDriver driver;
	String LandingPageResult;
	String offersPageResult;
	
	@Given("I go to Greenkart Landing page")
	public void i_go_to_greenkart_landing_page() {
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	    
	}
	@Given("I enter {string} on greenkart Landing page search filter")
	public void i_enter_on_greenkart_landing_page_search_filter(String name1) {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LandingPageResult = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	    System.out.println(LandingPageResult+" is the Landing page result");
		
	}
	@Then("I click on Top Deals and go to offers page")
	public void i_click_on_top_deals_and_go_to_offers_page() throws InterruptedException {
		driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(2000);
		switchToOffersPage();
	}
	
	@Then("I enter {string} on greenkart offers page search filter")
	public void i_enter_on_grrenkart_offers_page_search_filter(String name2) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name2);
		offersPageResult = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		System.out.println(offersPageResult+" is the offers page result");
		
	    
	}
	@Then("I validate that Top Deals and offers page shows same result")
	public void i_validate_that_top_deals_and_offers_page_shows_same_result() {
		
		 Assert.assertEquals(LandingPageResult, offersPageResult);
		 driver.quit();
	    
	}
	
	public void switchToOffersPage()
	{
		Set<String> winHandlesSet = driver.getWindowHandles();
		Iterator<String> i1 = winHandlesSet.iterator();
		String parentHandleString = i1.next();
		String childHandleString = i1.next();
		driver.switchTo().window(childHandleString);
	}

}
