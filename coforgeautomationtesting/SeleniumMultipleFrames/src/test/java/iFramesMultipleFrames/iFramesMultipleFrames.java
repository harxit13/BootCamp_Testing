package iFramesMultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFramesMultipleFrames {
@Test
public void Frames() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Automation_Browser/iFrames/iFrames.html");
	Thread.sleep(5000);
	 
	int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames" + totalnoofframes );
	
	driver.switchTo().frame("easycalculation");
	driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
	driver.findElement(By.id("log_email")).sendKeys("9740673180");
	driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='log_submit']")).click();
	String title1 =driver.getTitle();
	System.out.println(title1);
	
	driver.navigate().to("file:///C:/Automation_Browser/iFrames/iFrames.html");
	driver.switchTo().frame("Practice Automation Test");
	
	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("password")).sendKeys("Password123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	String title2= driver.getTitle();
	System.out.println(title2);
	Thread.sleep(5000);
	
}
}
