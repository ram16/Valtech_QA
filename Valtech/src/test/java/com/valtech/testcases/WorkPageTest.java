package com.valtech.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valtech.pages.Homepage;
import com.valtech.pages.Servicespage;
import com.valtech.pages.Workpage;
import com.valtech.qa.base.TestBase;

public class WorkPageTest extends TestBase {
	Homepage homePage;
	Workpage workpage;

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void setUp() throws IOException {
		init();

	}

	@Test
	public void verifyWorkPageContainsWorkHeader() {
		homePage = new Homepage(driver);
	
		workpage = new Workpage(driver);
		homePage.clickOnWork();
		assertTrue(workpage.isTextPresent("Work"));
		workpage.verifyWorktHeaderH1();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
