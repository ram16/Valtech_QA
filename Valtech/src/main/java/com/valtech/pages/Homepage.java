package com.valtech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.valtech.qa.base.TestBase;

public class Homepage extends TestBase {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='navigationMenuWrapper']//ul//li//a//span[contains(text(),'About')]")
	WebElement About;

	@FindBy(xpath = ".//*[@id='navigationMenuWrapper']//ul//li//a//span[contains(text(),'Work')]")
	WebElement Work;

	@FindBy(xpath = ".//*[@id='navigationMenuWrapper']//ul//li//a//span[contains(text(),'Services')]")
	WebElement Services;

	@FindBy(id = ".//*[@id='contacticon']")
	WebElement ContactIcon;

	@FindBy(xpath = ".//*[@id='container']/div[2]/div[3]/div[1]/header/h2")
	WebElement LatestNews;

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}

	}

	public Aboutpage clickOnAbout() {
		About.click();
		return new Aboutpage(driver);

	}

	public Servicespage clickOnServices() {
		Services.click();
		return new Servicespage(driver);
	}

	public Workpage clickOnWork() {
		Work.click();
		return new Workpage(driver);

	}

	public Contactpage clickOnContactIcon() {
		ContactIcon.click();
		return new Contactpage(driver);

	}
}
