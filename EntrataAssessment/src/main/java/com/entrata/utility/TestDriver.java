package com.entrata.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDriver {

	static WebDriver driver;

	public static void initDriver() throws Exception {

		// driver = WebDriverManager.chromedriver().create();
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();

	}

	public static void quitDriver() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
