package com.entrata.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.entrata.pages.EntHomePage;
import com.entrata.utility.TestDriver;

public class EntHomePageTest extends EntBaseClass {

	private EntHomePageTest() {

	}

	//validate the title of home page
	@Test
	public void validateTheTitleOfHomePage() {
		Assert.assertEquals(TestDriver.getDriver().getTitle(), "Property Management Software | Entrata");
	}

	//validate the title of marketing & exploring page
	@Test
	public void validateTitleOfMarketingAndExploringPage() {
		EntHomePage home = new EntHomePage();
		home.acceptCookieButton();
		home.clickMarketingAndExploring();
		Assert.assertEquals(TestDriver.getDriver().getTitle(),
				"Entrata Marketing & Leasing Products for your property management needs");

	}

	
	//validate the title of accounting page
	@Test
	public void validateTitleOfAccountingPage() {
		EntHomePage home = new EntHomePage();
		home.acceptCookieButton();
		home.clickAccounting();
		Assert.assertEquals(TestDriver.getDriver().getTitle(), "Accounting Solutions for Real Estate Property Management");

	}
}
