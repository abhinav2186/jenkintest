package com.jenky;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestClass1 {


	@Test
	public void testMethod1()
	
	{
		//driver.get("https://www.google.com");
		System.out.println("Inside test method 1 and in TestClass1 "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("Inside test method 2  and in TestClass1"+Thread.currentThread().getId());
		
	}
	
	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3()
	{
		System.out.println("Inside test method 3  and in TestClass1  "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void testMethod4()
	{
		System.out.println("Inside test method 4  and in TestClass1 "+Thread.currentThread().getId());
	}
	
	
}
