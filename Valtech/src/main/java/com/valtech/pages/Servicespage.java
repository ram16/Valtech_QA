package com.valtech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.valtech.qa.base.TestBase;

public class Servicespage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='container']//h1[contains(text(),'Services')]")
	WebElement ServicetHeader;

	public Servicespage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String verifyServicePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyServiceHeaderH1() {
		return ServicetHeader.isDisplayed();
	}

	public boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}

	}

}