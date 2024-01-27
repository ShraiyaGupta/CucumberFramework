package stepDefinition;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContextSetUp;

public class Hooks {
	TestContextSetUp testContextSetUp;
	
	public Hooks(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
	}

	@After
	public void tearDown() throws IOException
	{
		testContextSetUp.testBase.WebDriverManager().quit();
	}
}
