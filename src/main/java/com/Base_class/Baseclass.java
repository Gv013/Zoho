package com.Base_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vasan\\eclipse-workspace\\Zoho\\drive\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vasan\\eclipse-workspace\\Zoho\\drive\\chromedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void clickOnElements(WebElement element) {
		element.click();

	}

	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void quit() {
		driver.quit();

	}

	public static void capture(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File last = new File("C:\\Users\\vasan\\eclipse-workspace\\Zoho\\Screenshot\\img.png");
		FileUtils.copyFile(start, last);

	}
}
