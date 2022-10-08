package com.screenshot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{

	@Test
	public void google()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void facebook()
	{
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Assert.fail();
	}
	
	
	
	@Test
	public void twitter()
	{
		driver.get("https://www.twitter.com");
		System.out.println(driver.getTitle());
		Assert.fail();
	}

	
	
	
}
