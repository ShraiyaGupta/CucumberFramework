package PageObjects;

import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class PageObjectManager {
	WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	

	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OffersPage getOffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
}
