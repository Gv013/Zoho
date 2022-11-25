package com.Zoho.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Zoho.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition  {
	public static WebDriver driver = Runnerclass.driver;

	@Given("^user Launch The Zoho Web Application$")
	public void user_Launch_The_Zoho_Web_Application() throws Throwable {
		driver.get("https://www.zoho.com/");

	}

	@When("^user Click The Signin Page$")
	public void user_Click_The_Signin_Page() throws Throwable {
		WebElement signin = driver.findElement(By.className("zh-login"));
		signin.click();
	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"login_id\"]"));
		userName.sendKeys("abc@gmail.com");

	}

	@When("^user Click The Next Button$")
	public void user_Click_The_Next_Button() throws Throwable {
		WebElement next = driver.findElement(By.xpath("//*[@id=\"nextbtn\"]"));
		next.click();
		Thread.sleep(3000);
	}

	@When("^user Enters The Password In Password Field$")
	public void user_Enters_The_Password_In_Password_Field() throws Throwable {
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passWord.sendKeys("123456");
	}

	@When("^user Clicks The Login Button$")
	public void user_Clicks_The_Login_Button() throws Throwable {
		WebElement logIn = driver.findElement(By.id("nextbtn"));
		logIn.click();
		Thread.sleep(3000);
	}

	@When("^user Take The Screenshot Of The Page$")
	public void user_Take_The_Screenshot_Of_The_Page() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File last = new File("C:\\Users\\vasan\\eclipse-workspace\\Zoho\\Screenshot");
		FileUtils.copyFile(start, last);
		Thread.sleep(3000);
	}

	@Then("^user Quit The Zoho Page$")
	public void user_Quit_The_Zoho_Page() throws Throwable {
		driver.quit();
	}

}
