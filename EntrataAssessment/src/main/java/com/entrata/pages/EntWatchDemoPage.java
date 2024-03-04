package com.entrata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntWatchDemoPage {

	WebDriver driver;

	// class is created
	public EntWatchDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	// locater for first name
	By fName = By.id("firstName");

	// locater for last name
	By lName = By.id("lastName");

	// locater for email
	By email = By.id("email");

	// locater for company name
	By cName = By.id("companyName");

	// locater for phone no
	By phoneNumber = By.id("PhoneNumber");

	// locater for unit count

	// locater for job title
	By jobTitle = By.id("jobTitle");
	//

}
