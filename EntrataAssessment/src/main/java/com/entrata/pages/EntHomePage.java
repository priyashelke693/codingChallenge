package com.entrata.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.entrata.utility.TestDriver;

public class EntHomePage {

	WebDriver driver;
	By signInButton = By.xpath("//*[@class='button-default outline-dark-button' and text()='Sign In']");
	By watchDemoButton = By.xpath("//*[@class='button-default solid-dark-button' and text()='Watch Demo']");
	By cookies = By.xpath("//button[text()='Accept Cookies']");
	By explorePropertyManagement = By.xpath("//*[@title='Marketing & Leasing Explore Link']/child::*");
	By exploreAccounting = By.xpath("//*[@title='Accounting Explore Link']/child::*");
	

	 WebDriverWait wait = new WebDriverWait(TestDriver.getDriver(), Duration.ofSeconds(30));

	 
	 WebElement element;

	
	// Used explicit wait for visibility of element
	public void acceptCookieButton() {
		element = TestDriver.getDriver().findElement(cookies);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickSignInButton() {
		element = TestDriver.getDriver().findElement(signInButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void clickWatchDemoButton() {
		element = TestDriver.getDriver().findElement(watchDemoButton);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	// Used JavascriptExecutor and explicit wait till invisibility of that element
	public void clickMarketingAndExploring() {
		element = TestDriver.getDriver().findElement(explorePropertyManagement);
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor exe = (JavascriptExecutor) TestDriver.getDriver();
		exe.executeScript("arguments[0].click();", element);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	// Used JavascriptExecutor and explicit wait till invisibility of that element
	public void clickAccounting() {
		element = TestDriver.getDriver().findElement(exploreAccounting);
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor exe = (JavascriptExecutor) TestDriver.getDriver();
		exe.executeScript("arguments[0].click();", element);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
