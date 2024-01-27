package stepDefinition;
import PageObjects.OffersPage;
import io.cucumber.java.en.Then;
import utils.TestContextSetUp;

public class OffersPageStepDefinition {
	
	TestContextSetUp testContextSetUp;
	String offersPageResult;
	public OffersPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
	}
	OffersPage offersPage; 
	
	@Then("I click on Top Deals and go to offers page")
	public void i_click_on_top_deals_and_go_to_offers_page() throws InterruptedException {
		offersPage = testContextSetUp.pageObjectManager.getOffersPage();
		offersPage.clickTopDeals();
		Thread.sleep(2000);
		testContextSetUp.genericUtils.switchToChildPage();
	}
	
	@Then("^I enter (.+) on greenkart offers page search filter$")
	public void i_enter_on_greenkart_offers_page_search_filter(String name2) {
		offersPage = testContextSetUp.pageObjectManager.getOffersPage();
		offersPage.searchProduct(name2);
		offersPageResult = offersPage.getProductName();
		System.out.println(offersPageResult+" is the offers page result");
		    
	}

}
