package com.SeleniumWebDriver.LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextandPartialLink {
  WebDriver driver;
  public void setup() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.hollandandbarrett.com/");
	  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	  
  }
  public void linkTest() {
	  driver.findElement(By.partialLinkText("Vitamins")).click();
	  List<WebElement> links = driver.findElements(By.xpath("//a"));
	  int nolinks=links.size();
	  System.out.println("no of links:"+ nolinks);
	  for(int i=0;i<links.size();i++) {
		  System.out.println(links.get(i).getText());
		  String str = links.get(i).getText();
		  String str1= "Vitamins";
		  if(str==str1) {
			  driver.findElement(By.linkText("Vitamins")).click();
			  driver.findElement(By.xpath("//a[contains(text(),'Vitamins & Supplements')]")).click();
		  }
	  }
  }
  
}
