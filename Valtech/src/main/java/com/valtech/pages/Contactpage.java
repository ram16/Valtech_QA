package com.valtech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.valtech.qa.base.TestBase;

public class Contactpage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='contactbox']//ul//li")

	WebElement NumberOfCites;

	@FindBy(xpath = ".//*[@id='contactbox']//ul")

	WebElement NumberOfCountries;

	public Contactpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public int NumberOfCitesContacts() {

		NumberOfCites.getSize();

		return NumberOfCitesContacts();
	}

	public void NumberOfCountrysContacts() {

		NumberOfCountries.getSize();
	}

	public boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyCountOfficesCities(int count) {
		int countLinkes = driver.findElements(By.xpath(".//*[@id='contactbox']//ul//li")).size();
		if (count == countLinkes) {
			return true;

		} else {
			return false;
		}
	}

	public boolean verifyCountOfficesCountries(int count) {
		int countLinkes = driver.findElements(By.xpath(".//*[@id='contactbox']//ul")).size();
		if (count == countLinkes) {
			return true;

		} else {
			return false;
		}
	}
}