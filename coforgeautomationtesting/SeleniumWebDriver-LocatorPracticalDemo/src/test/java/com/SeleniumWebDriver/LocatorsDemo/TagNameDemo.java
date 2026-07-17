package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
public static void main (String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	List<WebElement> allLinks=
}
}
