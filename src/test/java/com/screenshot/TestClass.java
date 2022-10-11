package com.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class TestClass extends BaseTest{

	@Test
	public void google()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement textbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		js.executeScript("arguments[0].value='Elucidate Channel Docker and Java'", textbox);
		ExtentTest test = extent.createTest("ab");
		test.fail("failed");
	
		
	}
	
	
	@Test
	public void facebook()
	{
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Assert.fail();
		ExtentTest test = extent.createTest("ab");
		test.pass("passed");
		
	}
	
	
	
	@Test
	public void twitter()
	{
		driver.get("https://www.twitter.com");
		System.out.println(driver.getTitle());
		ExtentTest test = extent.createTest("ab");
		test.pass("passed");
		
	}

	
	
	
}
