package com.Zoho.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vasan\\eclipse-workspace\\Zoho\\src\\test\\java\\com\\Zoho\\feature", glue = "C:\\Users\\vasan\\eclipse-workspace\\Zoho\\src\\test\\java\\com\\Zoho\\stepdefinition", 
monochrome = true 

)

public class Runnerclass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Zoho\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}


