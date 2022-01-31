package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//using extends to access characteristics of Config class
public class SearchTab extends Config {

	//test
	@Test(priority = 18)
	public void test_case_six () throws InterruptedException {

		//prompt to search for user
		
		Thread.sleep(2000);
		WebElement search_Username = Config.driver.findElement(By.name("searchSystemUser[userName]"));
		search_Username.clear();
		search_Username.sendKeys("Selenium21256");
		
		// click the seach button
		WebElement search_button = Config.driver.findElement(By.name("_search"));
		search_button.click();
	}

	//test
	@Test(priority = 19)

	//validate Username
	public void validateUsername () {

		//test case and description
		Config.test = Config.extent.createTest("username validation", "validate that username");

		//calling username by xpath
		WebElement val_user = Config.driver.findElement(By.xpath(Locators.val_usernam));

		//validate that username text is input.username or not
		if(val_user.getText().equalsIgnoreCase(InstanceVariables.input_username)) {
			result = true;;
		}
		else {
			result = false;
		}

		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(result);
		Config.test.pass("Test Passed");
	}

	//test
	@Test(priority = 20)

	//validate Employee Name
	public void validateEmployeeName () {

		//test case and description
		Config.test = Config.extent.createTest("employee name validation", "validate that employee name");

		//calling Employee Name by xpath
		WebElement val_EmpNam = Config.driver.findElement(By.xpath(Locators.val_usernam));

		//checking that Employee Name text is expected_EmpName or not
		if(val_EmpNam.getText().equalsIgnoreCase(InstanceVariables.expected_EmpName)) {
			result = true;;
		}
		else {
			result = false;
		}

		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(result);
		Config.test.pass("Test Passed");
	}

	//test
	@Test(priority = 21)

	//validate Status
	public void validateStatus () {

		//test case and description
		Config.test = Config.extent.createTest("status enabled validation", "validate that status is enabled");

		//calling validation status by xpath
		WebElement val_drop_status = Config.driver.findElement(By.xpath(Locators.val_usernam));

		//checking that status text is validation status or not
		if(val_drop_status.getText().equalsIgnoreCase(Locators.val_status)) {
			result = true;;
		}
		else {
			result = false;
		}

		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(result);
		Config.test.pass("Test Passed");
	}
}
