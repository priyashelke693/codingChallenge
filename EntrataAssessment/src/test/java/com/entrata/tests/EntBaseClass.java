package com.entrata.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.entrata.utility.TestDriver;

public class EntBaseClass {

	WebDriver driver;

	 EntBaseClass() {

	}

	@BeforeMethod
	public void setUp() throws Exception {
		TestDriver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		TestDriver.quitDriver();
	}
}
