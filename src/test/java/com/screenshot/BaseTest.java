package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
 
	public static WebDriver driver;
	ExtentSparkReporter rep ;
	ExtentReports extent;
	
	@BeforeSuite
	public void reporting()
	{
		rep = new ExtentSparkReporter("extentreports.html");
		extent = new ExtentReports();
		extent.attachReporter(rep);
		
	}
	
	
	@BeforeTest
	public void setup()
	{
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
	}
	
	@AfterSuite
	public void tear()
	{
		extent.flush();
	}
	
	@SuppressWarnings("deprecation")
	public void captureScreenshot(String filename)
	{   
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/"+filename);
		try {
			FileUtils.copyFileToDirectory(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Screenshot saved successfully ");
		}
		
		
		
		
		
		
	}
	
	
}
