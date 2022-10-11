package com.screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Finding extends BaseTest{

	
	@Test
	public void test()
	{
		driver.get("https://www.wikipedia.org/");
		Select sel = new Select(driver.findElement(By.xpath("//div/select[@id='searchLanguage']")));
		
		
	    List<WebElement> li = sel.getOptions();
	    for(WebElement ee : li)
	    {
	    	System.out.println(ee.getText());
	    }
		
		
		
	}

}
