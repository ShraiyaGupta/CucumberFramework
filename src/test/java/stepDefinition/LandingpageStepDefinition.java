package stepDefinition;

import static org.testng.Assert.*;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.TestBase;
import utils.TestContextSetUp;

public class LandingpageStepDefinition {
	
	WebDriver driver;
	String landingPageResult;
	String offersPageResult;
	TestContextSetUp testContextSetUp;
	TestBase testBase;
	LandingPage landingPage;
	
	public LandingpageStepDefinition(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
		this.landingPage =testContextSetUp.pageObjectManager.getLandingPage();
	}
	
	
	@Given("I go to Greenkart Landing page")
	public void i_go_to_greenkart_landing_page() throws IOException {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	    
	}
	@Given("^I enter (.+) on greenkart Landing page search filter$")
	public void i_enter_on_greenkart_landing_page_search_filter(String name1) {
		landingPage.searchProduct(name1);
		testContextSetUp.landingPageResult = landingPage.getProductname();
	    System.out.println(landingPageResult+" is the Landing page result");
	}
	
	@Then("I validate that Top Deals and offers page shows same result")
	public void i_validate_that_top_deals_and_offers_page_shows_same_result() {
		
		 Assert.assertEquals(landingPageResult, offersPageResult);
		 
	    
	}
	
	

}
