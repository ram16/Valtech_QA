package com.valtech.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valtech.pages.Contactpage;
import com.valtech.pages.Homepage;
import com.valtech.pages.Servicespage;
import com.valtech.qa.base.TestBase;

public class ContactPageTest extends TestBase {
	Homepage homePage;
	Contactpage contactpage;

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void setUp() throws IOException {
		init();

	}

	@Test
	public void verifyContactsContainsOffices() {
		homePage = new Homepage(driver);
		contactpage = new Contactpage(driver);
		homePage.clickOnContactIcon();
		assertTrue(contactpage.isTextPresent("Contact our other offices"));
		assertTrue(contactpage.verifyCountOfficesCities(40));
		assertTrue(contactpage.verifyCountOfficesCountries(16));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
