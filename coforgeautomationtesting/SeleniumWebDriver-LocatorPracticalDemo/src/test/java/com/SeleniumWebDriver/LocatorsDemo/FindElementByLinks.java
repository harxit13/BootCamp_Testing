package com.SeleniumWebDriver.LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FindElementByLinks {
	WebDriver driver;
	int Total;
	  @BeforeTest
	  public void Vitaminandsupplement() throws Exception {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.hollandandbarrett.com/");
		  Thread.sleep(1000);
	 
	  try {
			 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			 
			  
		  } catch (Exception e){
			  System.out.println("Cookie popup not displayed");
		  }
	  }
			  
	  @Test
	  public void findElementById() throws Exception {
		  driver.findElement(By.xpath("//a[contains(text(),'Vitamins & Supplements')]")).click();
		  driver.findElement(By.linkText("Vitamins & Supplements")).click();
		  
		  List<WebElement>links = driver.findElements(By.xpath("//a"));
		  int linkcount =links.size();
		   Total = Total +links.size();
		  System.out.println("No of links:"+ linkcount);
		  for(int i=1;i<links.size();i++) {
			  System.out.println(links.get(i).getText());
		  }

	  }
}

