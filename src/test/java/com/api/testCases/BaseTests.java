package com.api.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {

	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
