package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDNameXpath {
  WebDriver driver;
  String baseURL = "https://practicetestautomation.com/practice-test-login/";
  @Test
  public void IDLocator() {
	  driver = new ChromeDriver();
	  driver.navigate().to(baseURL);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("username")).sendKeys("student");
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
	  String expectedTitle = "Logged In Successfully | Practice Test Automation";
      String actualTitle = driver.getTitle();

      if (actualTitle.equals(expectedTitle)) {
          System.out.println(" Matched");
      } else {
          System.out.println("not Matched");
      }

      driver.quit();
  }
}
