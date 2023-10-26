package com.api.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

	LoginPage loginPage;

	@Test
	public void homeTest() {
		loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123");
		String dashboardTextString = loginPage.getDashboardText();
		Assert.assertTrue(dashboardTextString.contains("Dashboard"));
	}

}
