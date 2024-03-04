package com.entrata.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.entrata.utility.TestDriver;

public class EntResidentLoginPage {

	 static  By residentLoginLink = By.xpath("//*[text()='Resident Login']");
	 static  By viewTheWebsiteButton = By.xpath("//*[text()='View the Website']");
	 static  By contactUsForm = By.xpath(
			"//*[@id='contact_us_form']/child::*[text()='If you have any questions or feedback, please fill out the form below']");

	 static  By name = By.xpath("//input[@id='name']");
	 static  By email = By.xpath("//input[@id='email']");
	 static  By propertyName = By.xpath("//input[@id='property_name']");
	 static  By propertyURL = By.xpath("//input[@id='property_url']");
	 static  By category = By.xpath("//select[@id='category']");
	 static  By message = By.xpath("//textarea[@id='message']");

	 WebDriverWait wait = new WebDriverWait(TestDriver.getDriver(), Duration.ofSeconds(30));

	 
	WebElement element;

	public void clickResidentLoginButton() {
		element = TestDriver.getDriver().findElement(residentLoginLink);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickViewWebsiteButton() {
		element = TestDriver.getDriver().findElement(viewTheWebsiteButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public WebElement visibilityOfContactUsForm() {
		return TestDriver.getDriver().findElement(contactUsForm);
	}

	public WebElement inputName() {
		return TestDriver.getDriver().findElement(name);
	}

	public WebElement inputEmail() {
		return TestDriver.getDriver().findElement(email);
	}

	public WebElement inputPropertyName() {
		return TestDriver.getDriver().findElement(propertyName);
	}

	public WebElement inputPropertyURL() {
		return TestDriver.getDriver().findElement(propertyURL);
	}

	public List<WebElement> categoryDropDown() {
		return TestDriver.getDriver().findElements(category);
	}

	public WebElement inputMessage() {
		return TestDriver.getDriver().findElement(message);
	}

	public void selectElementFromDropDownByText(String options) {
		element = TestDriver.getDriver().findElement(category);
		Select select = new Select(element);
		select.selectByVisibleText(options);
	}
}
