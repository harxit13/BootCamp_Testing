package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VitaminsAndSupplement {

	WebDriver driver;
	  String baseURL = "https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/";
	  @Test
	  public void Vitaminandsupplement() throws InterruptedException {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to(baseURL);
		  Thread.sleep(1000);
		  
		  try {
			 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			 
			  
		  } catch (Exception e){
			  System.out.println("Cookie popup not displayed");
			  
		  }
		  driver.findElement(By.xpath("//img[@alt='Vitamin Drinks category product example']")).click();
		  driver.findElement(By.className("ProductCard-module_title__cGT4y")).click();
		  String BrowserTitle =driver.getCurrentUrl();
		  System.out.println(BrowserTitle);
		  
		  driver.navigate().back();
		  BrowserTitle = driver.getCurrentUrl();
		  System.out.println(BrowserTitle);
		  
		  driver.navigate().refresh();
		  BrowserTitle = driver.getCurrentUrl();
		  System.out.println(BrowserTitle);
		  
		  driver.navigate().forward();
		  BrowserTitle = driver.getCurrentUrl();
		  System.out.println(BrowserTitle);
	  }
		  
}
