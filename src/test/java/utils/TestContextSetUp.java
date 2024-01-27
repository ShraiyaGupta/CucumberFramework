package utils;
import java.io.IOException;
import java.security.PublicKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;

import PageObjects.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public String landingPageResult;
	public String offersPageResult;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetUp() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
