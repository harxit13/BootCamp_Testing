package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brightest {
	WebDriver driver;
	  String baseURL = "https://profile.brightest.org/accounts/login/?";
	  @Test
	  public void IDLocator() {
		  driver = new ChromeDriver();
		  driver.navigate().to(baseURL);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("Username")).sendKeys("your_email");
		  driver.findElement(By.id("Password")).sendKeys("your_password");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		 /* String expectedTitle = "Logged In Successfully | Practice Test Automation";
	      String actualTitle = driver.getTitle();

	      if (actualTitle.equals(expectedTitle)) {
	          System.out.println(" Matched");
	      } else {
	          System.out.println("not Matched");
	      }
*/
	      driver.quit();
	  }
}
