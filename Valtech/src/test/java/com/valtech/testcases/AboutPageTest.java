package com.valtech.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valtech.pages.Aboutpage;
import com.valtech.pages.Homepage;
import com.valtech.qa.base.TestBase;

public class AboutPageTest extends TestBase {
	Homepage homePage;
	Aboutpage aboutpage;

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void setUp() throws IOException {
		init();

	}

	@Test
	public void verifyAboutPageContainsAboutHeader() {
		homePage = new Homepage(driver);
		aboutpage = new Aboutpage(driver);
		homePage.clickOnAbout();
		assertTrue(aboutpage.isTextPresent("About"));
		aboutpage.verifyAboutHeaderH1();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
