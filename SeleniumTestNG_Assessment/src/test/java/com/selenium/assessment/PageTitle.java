package com.selenium.assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

//using extends to access characteristics of Config class 
public class PageTitle extends Config {


	public void test_case_one() {

		//link to the url
		Config.driver.get(Locators.web_url);	
	}
	
	//test
	@Test(priority = 1)
	public void validateTitle() throws Exception {
		
		//test case and description
		Config.test = Config.extent.createTest("Open orangeHRM url", "Get the title of the current page.");
		
		//actual title
		String actualTitle = Config.driver.getTitle();

		//expected title
		String expectedTitle = InstanceVariables.exp_title;

		//verify that the expected result and the actual result matched or not
		Assert.assertEquals(actualTitle, expectedTitle); 

		//delay by 5 seconds
		Thread.sleep(5000);
		Config.test.pass("Test Passed");
	}
}
